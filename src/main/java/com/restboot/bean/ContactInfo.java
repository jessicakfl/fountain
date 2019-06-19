package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ContactInfo
{
    private String ContactContent;

    private String ContactType;

    public String getContactContent ()
    {
        return ContactContent;
    }

    public void setContactContent (String ContactContent)
    {
        this.ContactContent = ContactContent;
    }

    public String getContactType ()
    {
        return ContactType;
    }

    public void setContactType (String ContactType)
    {
        this.ContactType = ContactType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ContactContent = "+ContactContent+", ContactType = "+ContactType+"]";
    }
}
