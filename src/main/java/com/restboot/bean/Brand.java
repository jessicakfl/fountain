package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Brand
{
    private Branch[] Branch;

    private String BrandName;

    public Branch[] getBranch ()
    {
        return Branch;
    }
    @JsonProperty("Branch")
    public void setBranch (Branch[] Branch)
    {
        this.Branch = Branch;
    }

    public String getBrandName ()
    {
        return BrandName;
    }

    public void setBrandName (String BrandName)
    {
        this.BrandName = BrandName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Branch = "+Branch+", BrandName = "+BrandName+"]";
    }
}