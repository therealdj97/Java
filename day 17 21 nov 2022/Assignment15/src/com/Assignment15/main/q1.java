package com.Assignment15.main;

import java.time.LocalDate;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ID = LocalDate.now(); System.out.println("Today's date : "+ID);

		System.out.println("	");
		System.out.println("Date  10 days after Today's date : "+ID.plusDays(10)); System.out.println("	");
		System.out.println("Date 10 days before Today's date : "+ID.minusDays(10));
		
	}

}
