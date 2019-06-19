package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Data
{
private Brand[] Brand;

public Brand[] getBrand ()
{
return Brand;
}
@JsonProperty("Brand")
public void setBrand (Brand[] Brand)
{
this.Brand = Brand;
}

@Override
public String toString()
{
return "ClassPojo [Brand = "+Brand+"]";
}
}