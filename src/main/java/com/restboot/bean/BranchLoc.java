package com.restboot.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BranchLoc
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
    @JsonProperty("CustomerSegment")
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
    @JsonProperty("Type")
    public void setType (String Type)
    {
        this.Type = Type;
    }
    @JsonProperty("ContactInfo")
    public ContactInfo[] getContactInfo ()
    {
        return ContactInfo;
    }

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
    @JsonProperty("OtherServiceAndFacility")
    public void setOtherServiceAndFacility (OtherServiceAndFacility[] OtherServiceAndFacility)
    {
        this.OtherServiceAndFacility = OtherServiceAndFacility;
    }

    public String getSequenceNumber ()
    {
        return SequenceNumber;
    }
    @JsonProperty("SequenceNumber")
    public void setSequenceNumber (String SequenceNumber)
    {
        this.SequenceNumber = SequenceNumber;
    }

    public String getIdentification ()
    {
        return Identification;
    }
    @JsonProperty("Identification")
    public void setIdentification (String Identification)
    {
        this.Identification = Identification;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", CustomerSegment = "+CustomerSegment+", Availability = "+Availability+", Type = "+Type+", ContactInfo = "+ContactInfo+", PostalAddress = "+PostalAddress+", OtherServiceAndFacility = "+OtherServiceAndFacility+", SequenceNumber = "+SequenceNumber+", Identification = "+Identification+"]";
    }
}