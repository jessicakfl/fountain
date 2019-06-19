package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class OpeningHours
{
    private String OpeningTime;

    private String ClosingTime;

    public String getOpeningTime ()
    {
        return OpeningTime;
    }

    public void setOpeningTime (String OpeningTime)
    {
        this.OpeningTime = OpeningTime;
    }

    public String getClosingTime ()
    {
        return ClosingTime;
    }

    public void setClosingTime (String ClosingTime)
    {
        this.ClosingTime = ClosingTime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [OpeningTime = "+OpeningTime+", ClosingTime = "+ClosingTime+"]";
    }
}
