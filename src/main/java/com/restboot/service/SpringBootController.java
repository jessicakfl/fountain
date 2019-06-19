package com.restboot.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
/*
 * RestController getBranchLocation
 * @author Jessica Bai
 */
@RestController
class SpringBootController {
	@Autowired
	private BankService bankService;

	@RequestMapping(value = "/listBranchLocation")
	public @ResponseBody BranchLocation[] listBranchLocation() throws JsonParseException, JsonMappingException, IOException, Exception {
		return bankService.getBranchLocation();
	}

	@RequestMapping("/listBranchLocationByCity/{cityName}")
	public @ResponseBody BranchLocation[] listBranchLocationByCity(@PathVariable String cityName) throws JsonParseException, JsonMappingException, IOException, Exception {
		return bankService.getBranchLocationByCity(cityName);
	}
}