package com.hotel_reservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue() {

		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 110);
		Hotel hotelLakewood = new Hotel();
		Assert.assertEquals(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());

	}

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreInCorrect_ShoulReturnFalse() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		Hotel isValidHotel2 = hotelReservationSystem.addHotel("Bridgewood", 160);
		Hotel hotelBridgewood = new Hotel();
		Assert.assertNotEquals(hotelBridgewood.getHotelName(), isValidHotel2.getHotelName());

	}
}