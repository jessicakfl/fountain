package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Availability
{
    private StandardAvailability StandardAvailability;

    public StandardAvailability getStandardAvailability ()
    {
        return StandardAvailability;
    }
    @JsonProperty("StandardAvailability")
    public void setStandardAvailability (StandardAvailability StandardAvailability)
    {
        this.StandardAvailability = StandardAvailability;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [StandardAvailability = "+StandardAvailability+"]";
    }
}