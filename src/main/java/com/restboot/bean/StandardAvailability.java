package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StandardAvailability
{
    private Day[] Day;

    public Day[] getDay ()
    {
        return Day;
    }
    @JsonProperty("Day")
    public void setDay (Day[] Day)
    {
        this.Day = Day;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Day = "+Day+"]";
    }
}