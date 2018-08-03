package com.cg.datediff;

//class comparing two dates and getting the difference between two dates

public class Date {
	private int days;
	private int months;
	private int years;

	// Parameterized constructor
	public Date(int days, int months, int years) {
		this.days = days;
		this.months = months;
		this.years = years;
	}

	public String toString() {
		return days + "/" + months + "/" + years;
	}

	// comparing two dates
	public boolean isSmaller(Date d) {

		boolean state = true;
		if (this.years > d.years) {
			return false;
		} else if (this.months > d.months) {
			return false;
		} else if (this.days > d.days) {
			return false;
		} else {
			return state;
		}
	}

	// giving the difference between two dates
	public int[] diff(Date d) {
		int arr[] = new int[3];
		arr[0] = Math.abs(this.days - d.days);
		arr[1] = Math.abs(this.months - d.months);
		arr[2] = Math.abs(this.years - d.years);
		return arr;
	}
}
