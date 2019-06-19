package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class GeographicCoordinates
{
    private String Latitude;

    private String Longitude;

    public String getLatitude ()
    {
        return Latitude;
    }
    @JsonProperty("Latitude")
    public void setLatitude (String Latitude)
    {
        this.Latitude = Latitude;
    }

    public String getLongitude ()
    {
        return Longitude;
    }
    @JsonProperty("Longitude")
    public void setLongitude (String Longitude)
    {
        this.Longitude = Longitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Latitude = "+Latitude+", Longitude = "+Longitude+"]";
    }
}

