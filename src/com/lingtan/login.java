package com.lingtan;
import java.util.Scanner;
public class login {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		login();
	}
	
	public static void login() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the UserName");
		Long mobNum = input.nextLong();
		if(mobNum == 9600923846L) {
			System.out.println("Enter the password");
			String password = input.next();
			if(password.equals("Lingtan")) {
				System.out.println("Successfully logged in");
				afterLogin();
			}
			else {
				System.out.println("The password is invalid");
			}
		}
		else {
		System.out.println("The Entered username is invalid ");
		}
	
	}

	public static void afterLogin() {
		System.out.println("Select the Cab Type");
		System.out.println("1.Micro - (Rs.10/Km)");
		System.out.println("2.Mini - (Rs.15/Km)");
		System.out.println("3.Prime - (Rs.20/Km)");
		System.out.println("Please choose options 1,2 or 3 ");
		
		Scanner input = new Scanner(System.in);
		int cartype = input.nextInt();
		switch(cartype) {
		case 1:
			micro();
			break;
		case 2:
			mini();
			break;
		case 3:
			prime();
			break;
		default:
			System.out.println("The option is invalid");
			break;
		}	
	}

	public static void micro() {
		System.out.println("You have selected the micro cab");
		String type ="Micro";
		int kmMicro=km();
		int total = kmMicro * 10;
		System.out.println("The Total cost for the distance of "+ kmMicro+"km without GST is " +total);	
		Part2.gst(type , total, kmMicro);
	}
	
	
	public static void mini() {
		System.out.println("You have selected the micro cab");
		String type ="Mini";
		int kmMicro=km();
		int total = kmMicro * 15;
		System.out.println("The Total cost for the distance of "+ kmMicro+" without GST is " +total);
		Part2.gst(type , total, kmMicro);
		
	}
	public static void prime() {
		System.out.println("You have selected the micro cab");
		String type ="Prime";
		int kmMicro=km();
		int total = kmMicro * 20;
		System.out.println("The Total cost for the distance of "+ kmMicro+" without GST is " +total);
		Part2.gst(type , total, kmMicro);
	}
	
	
	public static int km() {
		System.out.println("Enter the Total distance to travel in kilometeres");
		int km = input.nextInt();
		return km;
		
	}

}
	