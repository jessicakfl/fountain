package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Day
{
    private String Name;

    private OpeningHours[] OpeningHours;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public OpeningHours[] getOpeningHours ()
    {
        return OpeningHours;
    }
    @JsonProperty("OpeningHours")
    public void setOpeningHours (OpeningHours[] OpeningHours)
    {
        this.OpeningHours = OpeningHours;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", OpeningHours = "+OpeningHours+"]";
    }
}
