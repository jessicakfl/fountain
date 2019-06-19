package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PostalAddress
{
    private String[] CountrySubDivision;

    private String TownName;

    private String PostCode;

    private GeoLocation GeoLocation;

    private String[] AddressLine;

    private String Country;

    public String[] getCountrySubDivision ()
    {
        return CountrySubDivision;
    }

    public void setCountrySubDivision (String[] CountrySubDivision)
    {
        this.CountrySubDivision = CountrySubDivision;
    }

    public String getTownName ()
    {
        return TownName;
    }

    public void setTownName (String TownName)
    {
        this.TownName = TownName;
    }

    public String getPostCode ()
    {
        return PostCode;
    }

    public void setPostCode (String PostCode)
    {
        this.PostCode = PostCode;
    }

    public GeoLocation getGeoLocation ()
    {
        return GeoLocation;
    }
    @JsonProperty("GeoLocation")
    public void setGeoLocation (GeoLocation GeoLocation)
    {
        this.GeoLocation = GeoLocation;
    }

    public String[] getAddressLine ()
    {
        return AddressLine;
    }
    @JsonProperty("AddressLine")
    public void setAddressLine (String[] AddressLine)
    {
        this.AddressLine = AddressLine;
    }

    public String getCountry ()
    {
        return Country;
    }

    public void setCountry (String Country)
    {
        this.Country = Country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CountrySubDivision = "+CountrySubDivision+", TownName = "+TownName+", PostCode = "+PostCode+", GeoLocation = "+GeoLocation+", AddressLine = "+AddressLine+", Country = "+Country+"]";
    }
}