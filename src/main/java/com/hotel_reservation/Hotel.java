package com.hotel_reservation;

public class Hotel {

	String hotelName;
	double weekdayRegularCustomerCost;

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", weekdayRegularCustomerCost=" + weekdayRegularCustomerCost + "]";
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the weekdayRegularCustomerCost
	 */
	public double getWeekdayRegularCustomerCost() {
		return weekdayRegularCustomerCost;
	}

	/**
	 * @param weekdayRegularCustomerCost the weekdayRegularCustomerCost to set
	 */
	public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
	}

	public Hotel() {

	}
}
