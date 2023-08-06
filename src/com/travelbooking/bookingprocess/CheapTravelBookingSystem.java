package com.travelbooking.bookingprocess;

import com.travelbooking.domain.TravelTicket;

public class CheapTravelBookingSystem implements BookingSystem {

	@Override
	public void setTravelTicket(TravelTicket ticket) {
       System.out.println("CheapTravel has received ticket "+ ticket);
	}

	@Override
	public void requestBooking() {
       System.out.println("CheapTravel has had a booking request");
	}

	@Override
	public boolean getStatus() {
		return false;
	}

	@Override
	public boolean cancel() {
		return false;
	}

}
