package com.FutsalManagement.model;

/**
 *
 * @author Munal Lmu Id = 23048582
 */
public class BookingModel {

    private String BookingDate;
    private String BookingId;
    private String Location;
    private String FullName;
    private String contact;
    private String TotalCost;

    public BookingModel() {
    }

    public BookingModel(String BookingDate, String BookingId, String Location, String FullName, String contact, String TotalCost) {
        this.BookingDate = BookingDate;
        this.BookingId = BookingId;
        this.Location = Location;
        this.FullName = FullName;
        this.contact = contact;
        this.TotalCost = TotalCost;
    }

    public String getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(String BookingDate) {
        this.BookingDate = BookingDate;
    }

    public String getBookingId() {
        return BookingId;
    }

    public void setBookingId(String BookingId) {
        this.BookingId = BookingId;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }

    public String getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

}
