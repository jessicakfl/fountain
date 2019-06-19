package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BranchList{
private Data[] data;

//private Meta meta;

public Data[] getData ()
{
    return data;
}
@JsonProperty("data")
public void setData (Data[] data)
{
    this.data = data;
}

//public Meta getMeta ()
//{
//    return meta;
//}
//@JsonProperty("meta")
//public void setMeta (Meta meta)
//{
//    this.meta = meta;
//}

@Override
public String toString()
{
    return "ClassPojo [data = "+data+"]";
}
}
