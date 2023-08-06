package com.travelbooking.bookingprocess;

import com.travelbooking.domain.TravelTicket;

public class EnjoyableToursBookingSystem implements BookingSystem {

	@Override
	public void setTravelTicket(TravelTicket ticket) {
     System.out.println("Enjoyable Tours has received ticket " + ticket);
	}

	@Override
	public void requestBooking() {
		 System.out.println("Enjoyable Tours has booking request");
	}

	@Override
	public boolean getStatus() {
		 System.out.println("Enjoyable Tours has providing the booking status ");
		return false;
	}

	@Override
	public boolean cancel() {
		// TODO Auto-generated method stub
		return false;
	}

}
