package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Branch
{
    private String Name;

    private String[] CustomerSegment;

    private Availability Availability;

    private String Type;

    private ContactInfo[] ContactInfo;

    private PostalAddress PostalAddress;

    private OtherServiceAndFacility[] OtherServiceAndFacility;

    private String SequenceNumber;

    private String Identification;

    private String[] Accessibility;
    public String getName ()
    {
        return Name;
    }
    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String[] getCustomerSegment ()
    {
        return CustomerSegment;
    }

    public void setCustomerSegment (String[] CustomerSegment)
    {
        this.CustomerSegment = CustomerSegment;
    }

    public Availability getAvailability ()
    {
        return Availability;
    }
    @JsonProperty("Availability")
    public void setAvailability (Availability Availability)
    {
        this.Availability = Availability;
    }

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public ContactInfo[] getContactInfo ()
    {
        return ContactInfo;
    }
    @JsonProperty("ContactInfo")
    public void setContactInfo (ContactInfo[] ContactInfo)
    {
        this.ContactInfo = ContactInfo;
    }

    public PostalAddress getPostalAddress ()
    {
        return PostalAddress;
    }
    @JsonProperty("PostalAddress")
    public void setPostalAddress (PostalAddress PostalAddress)
    {
        this.PostalAddress = PostalAddress;
    }

    public OtherServiceAndFacility[] getOtherServiceAndFacility ()
    {
        return OtherServiceAndFacility;
    }

    public void setOtherServiceAndFacility (OtherServiceAndFacility[] OtherServiceAndFacility)
    {
        this.OtherServiceAndFacility = OtherServiceAndFacility;
    }

    public String getSequenceNumber ()
    {
        return SequenceNumber;
    }

    public void setSequenceNumber (String SequenceNumber)
    {
        this.SequenceNumber = SequenceNumber;
    }

    public String getIdentification ()
    {
        return Identification;
    }

    public void setIdentification (String Identification)
    {
        this.Identification = Identification;
    }

    public String[] getAccessibility ()
    {
        return Accessibility;
    }

    public void setAccessibility (String[] Accessibility)
    {
        this.Accessibility = Accessibility;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", CustomerSegment = "+CustomerSegment+", Availability = "+Availability+", Type = "+Type+", ContactInfo = "+ContactInfo+", PostalAddress = "+PostalAddress+", OtherServiceAndFacility = "+OtherServiceAndFacility+", SequenceNumber = "+SequenceNumber+", Identification = "+Identification+", Accessibility = "+Accessibility+"]";
    }
}
