package com.cg.datedifferencetest;

import com.cg.datediff.Date;

//class with main function and printing difference of dates

public class DateTest {

	public static void main(String[] args) {
		Date date_obj = new Date(12, 4, 1995); // object creation
		Date date_obj2 = new Date(12, 5, 1994);

		int array[] = date_obj.diff(date_obj2); // storing date difference in an array

		System.out.println(date_obj2.isSmaller(date_obj2));
		for (int b : array) { // for each loop printing date difference
			System.out.println(b);
		}
	}

}
