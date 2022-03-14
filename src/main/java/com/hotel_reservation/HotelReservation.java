package com.hotel_reservation;

public class HotelReservation {
	public static void main(String[] args) {

		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		System.out.println("Welcome to Hotel Reservation System");
		hotelReservationSystem.addHotel("Lakewood", 110);
		hotelReservationSystem.addHotel("Bridgewood", 160);
		hotelReservationSystem.addHotel("Ridgewood", 220);

		// System.out.print(hotelReservationSystem.hotelArrayList);

		for (Hotel list : hotelReservationSystem.hotelArrayList) {
			System.out.println(list);
		}
	}
}
