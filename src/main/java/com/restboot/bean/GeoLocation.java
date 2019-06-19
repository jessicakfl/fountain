package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class GeoLocation
{
private GeographicCoordinates GeographicCoordinates;

public GeographicCoordinates getGeographicCoordinates ()
{
return GeographicCoordinates;
}
@JsonProperty("GeographicCoordinates")
public void setGeographicCoordinates (GeographicCoordinates GeographicCoordinates)
{
this.GeographicCoordinates = GeographicCoordinates;
}

@Override
public String toString()
{
return "ClassPojo [GeographicCoordinates = "+GeographicCoordinates+"]";
}
}