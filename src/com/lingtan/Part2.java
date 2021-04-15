
package com.lingtan;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Part2 {
	static Scanner input = new Scanner(System.in);
	public static void gst(String type ,int km ,int justKm) {
		float percentage = (km * 7)/100;
		float gstResult = percentage + km;
		System.out.println("The Final cost including GST for "+type+" type car is "+gstResult);
		booking(type, km, justKm , gstResult);
		
	}
	
	public static void booking(String type, int km, int justKm,  float gstResults) {
		System.out.println("Journey details for "+ type);
		System.out.println("Enter the Journey date in YYYY-MM-DD format");
		String date = input.next();
		LocalDate cdate = LocalDate.now();
		LocalDate parsedDate = LocalDate.parse(date);
		if(parsedDate.isBefore(cdate)) {
			System.out.println("Please Enter a present date or a Future date");
		}
		else {
		System.out.println("Enter the Journey Time in HH:MM:SS format");	
		String time = input.next();
		LocalTime parsedTime = LocalTime.parse(time);
		int hourAlone = parsedTime.getHour();
		if(hourAlone >=5 && hourAlone <= 7) {
			double peakprice = (justKm * 0.0125)+gstResults;
			//System.out.println("Since 5pm to 7pm is a peak hours is "+peakprice);
			System.out.println("Your Journey on "+type +" car starts on " + parsedDate +" at " + parsedTime+" Since 5pm to 7pm is a peak hours is "+peakprice);
			seniorcheck(peakprice);
		}
		else {
			System.out.println("Your Journey on "+type +" car starts on " + parsedDate +" at " + parsedTime +" and Charged a total fair of Rs."+ gstResults);
			seniorcheck(gstResults);
				
		}
		}
	}
	public static void seniorcheck(double rate) {
		System.out.println("Enter your Date of Birth to check the eligibility for senior citizen discont");
		String age = input.next();
		LocalDate parsedAge = LocalDate.parse(age);
		LocalDate cdate = LocalDate.now();
		int onlyYearofPerson = parsedAge.getYear();
		int TodayYear = cdate.getYear();
		int ageResult = TodayYear - onlyYearofPerson;
		if(ageResult >= 60) {
			double discountPrice = (rate * 50)/100;
			System.out.println("You are eligible for 50% discount your discounted fair prize is "+discountPrice);
			
			
		}
		else {
			System.out.println("Sorry you are not eligible for Discount your fair prize is "+rate);
			
		}
		
	}
	

}
