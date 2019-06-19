package com.restboot.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restboot.bean.Branch;
import com.restboot.bean.BranchList;
import com.restboot.bean.Brand;
import com.restboot.bean.Data;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/*
 * Service getBranchLocation
 * @author Jessica Bai
 */
@Service
public class BankService {
	final static Logger logger = Logger.getLogger(BankService.class);

	public BranchLocation[] getBranchLocationByCity(String city)
			throws JsonParseException, JsonMappingException, IOException,
			Exception {
		return getRespondFromBackend(city);
	}

	/**
	 * getBranchLocation()
	 * 
	 */
	public BranchLocation[] getBranchLocation() throws JsonParseException,
			JsonMappingException, IOException, Exception {
		return getRespondFromBackend("");
	}

	/**
	 * getRespondFromBackend
	 * 
	 * @param city
	 * @return BranchLocation[]
	 */
	private BranchLocation[] getRespondFromBackend(String city)
			throws JsonParseException, JsonMappingException, IOException,
			Exception {
		Response response;
		String message = "";
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				.url("https://api.halifax.co.uk/open-banking/v2.2/branches")
				.get()
				.addHeader("if-modified-since", "2018-10-01")
				.addHeader("if-none-match", "2018-10-07")
				.addHeader("accept",
						"application/prs.openbanking.opendata.v2.2+json")
				.build();
		ArrayList<BranchList[]> bList = null;
		response = client.newCall(request).execute();
		message = response.body().string();
		logger.debug(message);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
				true);
		bList = mapper.readValue(message,
				new TypeReference<List<BranchList[]>>() {
				});
		BranchList[] blist = (BranchList[]) bList.get(0);
		Data[] data = (Data[]) blist[0].getData();
		Brand[] brand = (Brand[]) data[0].getBrand();
		Branch[] bran = (Branch[]) brand[0].getBranch();
		BranchLocation[] bLoc = getBanchLocations(bran);
		if (!city.isEmpty())
			bLoc = getBanchLocationsByCity(bLoc, city);
		return bLoc;
	}

	/**
	 * getBanchLocations
	 * 
	 */
	private BranchLocation[] getBanchLocations(Branch[] branchs)
			throws Exception {
		List<BranchLocation> bLoc = new ArrayList<BranchLocation>();
		for (Branch branch : branchs) {
			try {
				bLoc.add(new BranchLocation(branch.getName(), branch
						.getPostalAddress().getGeoLocation()
						.getGeographicCoordinates().getLatitude(), branch
						.getPostalAddress().getGeoLocation()
						.getGeographicCoordinates().getLongitude(), branch
						.getPostalAddress().getAddressLine()[0], branch
						.getPostalAddress().getTownName(),
						isNotNullOrEmpty((branch.getPostalAddress()
								.getCountrySubDivision())[0]) ? branch
								.getPostalAddress().getCountrySubDivision()[0]
								: "", branch.getPostalAddress().getCountry(),
						(branch.getPostalAddress().getPostCode())));
			} catch (Exception e) {
				continue;
			}
		}
		return bLoc.toArray((new BranchLocation[bLoc.size()]));
	}

	private static boolean isNotNullOrEmpty(String str) {
		return (str != null && !str.isEmpty());
	}

	private BranchLocation[] getBanchLocationsByCity(
			BranchLocation[] branchLocations, String city) {
		List<BranchLocation> locatioByCity = new ArrayList<BranchLocation>();
		for (BranchLocation branchLocation : branchLocations) {
			try {
				if (branchLocation.getCity().equalsIgnoreCase(city)) {
					locatioByCity.add(branchLocation);
				}
			} catch (Exception e) {
				continue;
			}
		}

		return locatioByCity
				.toArray((new BranchLocation[locatioByCity.size()]));
	}
}
