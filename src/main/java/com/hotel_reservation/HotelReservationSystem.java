package com.hotel_reservation;

/*
	 * @Purpose :To add hotel name & weekly other rates
	 * @Param :setters to initiate values
	 * @Function :setter and getters
	 * @Return :return hotel information
	 */
import java.util.ArrayList;

public class HotelReservationSystem {

	ArrayList<Hotel> hotelArrayList = new ArrayList<Hotel>();
	public Hotel hotel;

	public Hotel addHotel(String hotelName, double weekdayRateRegular) {

		hotel = new Hotel();
		hotel.setHotelName(hotelName);

		hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);

		hotelArrayList.add(hotel);
		return hotel;
	}

}
