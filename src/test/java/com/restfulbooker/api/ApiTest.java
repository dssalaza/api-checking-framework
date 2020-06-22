package com.restfulbooker.api;

import com.restfulbooker.api.payloads.request.AuthPayload;
import com.restfulbooker.api.payloads.request.BookingPayload;
import com.restfulbooker.api.payloads.response.AuthResponse;
import com.restfulbooker.api.requests.Auth;
import com.restfulbooker.api.requests.Booking;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static junit.framework.TestCase.fail;

public class ApiTest {

    @Test
    public void getBookingShouldReturn200(){
        ResponseEntity<String> Response = Booking.getBookings();
        assertThat(Response.getStatusCode(), is(HttpStatus.OK));
    }

    @Test
    public void getBookingIdShouldReturn200(){
        ResponseEntity<String> response = Booking.getBooking(1, MediaType.APPLICATION_JSON);
        assertThat(response.getStatusCode(), is(HttpStatus.OK));
    }

    @Test
    public void getBookingIdWithBadAcceptShouldReturn418(){
        try {

            Booking.getBooking(1, MediaType.TEXT_PLAIN);

            fail("HttpClientError not thrown");
        } catch(HttpClientErrorException e){
            System.out.println(e);
            assertThat(e.getStatusCode(), is(HttpStatus.I_AM_A_TEAPOT));
        }
    }

    @Test
    public void postBookingReturns200(){
        BookingPayload payload = new BookingPayload.BookingPayloadBuilder()
                .setFirstname("Mary")
                .setLastname("White")
                .setTotalprice(200)
                .setDepositpaid(true)
                .setCheckin(new Date())
                .setCheckout(new Date())
                .setAdditionalneeds("none")
                .build();

        ResponseEntity<String> response = Booking.postBooking(payload);
        assertThat(response.getStatusCode(), is(HttpStatus.OK));
    }

    @Test
    public void deleteBookingReturns201(){

        AuthPayload authPayload = new AuthPayload.AuthPayloadBuilder()
                .setUsername("admin")
                .setPassword("password123")
                .build();

ResponseEntity<AuthResponse> authResponse = Auth.postAuth(authPayload){

        }

    }

}

