package com.restfulbooker.api.payloads.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingResponse {

//    {
//        "bookingid": 17,
//        "booking": {
//             "firstname": "Sally",
//             "lastname": "Brown",
//             "totalprice": 111,
//             "depositpaid": true,
//             "bookingdates": {
//                  "checkin": "2013-02-23",
//                  "checkout": "2014-10-23"
//              },
//              "additionalneeds": "Breakfast"
//         }
//    }

    @JsonProperty
    private int bookingid;
    @JsonProperty
    private BookingDetails booking;


    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }


    public void setBooking(BookingDetails booking) {
        this.booking = booking;
    }

    public int getBookingid() {
        return bookingid;
    }

    public BookingDetails getBooking() {
        return booking;
    }
}