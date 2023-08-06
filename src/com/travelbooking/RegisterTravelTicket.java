package com.travelbooking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.travelbooking.domain.BusTicket;
import com.travelbooking.domain.PlaneTicket;
import com.travelbooking.domain.TrainTicket;
import com.travelbooking.domain.TravelClass;
import com.travelbooking.exceptions.InvalidTravelDurationException;

public class RegisterTravelTicket {

	public static void main(String[] args) throws InvalidTravelDurationException {
	
		Scanner scanner = new Scanner(System.in);
		
		int option = 0;
		
		while(!(option >= 1 && option <=3)){
			System.out.println("Enter 1 for bus ticket, 2 for train ticket, 3 for plane ticket");
			option = scanner.nextInt();
			}
		
		System.out.println("Enter the bookingref");
		Long ref = scanner.nextLong();
		scanner.nextLine();
		
		System.out.println("Enter the origin");
		String origin = scanner.nextLine();
		
		
		System.out.println("Enter the destination");
		String destination = scanner.nextLine();

		
		System.out.println("Enter the price");
		BigDecimal price = scanner.nextBigDecimal();
		scanner.nextLine();
		
		System.out.println("Enter the depature time");
		String dtime=scanner.nextLine();
		LocalDateTime departureTime = LocalDateTime.parse(dtime);
		
		
		System.out.println("Enter the arrival time");
		String atime=scanner.nextLine();
		LocalDateTime arrivalTime = LocalDateTime.parse(atime);
	
		
		switch (option) {
		case 1:
			BusTicket busticket= new BusTicket(ref,origin,destination,price,departureTime,arrivalTime,null);
			System.out.println(busticket);
			break;
			
		case 2:
			System.out.println("Enter the travel class");
			String tClass = scanner.nextLine();
			TravelClass travelClass = TravelClass.valueOf(tClass.toUpperCase());
			System.out.println("enter the carriage number");
			int carriageNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("enter the seat number");
			int seatNumber = scanner.nextInt();
			TrainTicket trainticket= new TrainTicket(ref,origin,destination,price,departureTime,arrivalTime,travelClass,carriageNumber,seatNumber);
			System.out.println(trainticket);
			break;
			
		case 3:
			System.out.println("Enter the travel class");
			String tClass2 = scanner.nextLine();
			TravelClass travelClass2 = TravelClass.valueOf(tClass2.toUpperCase());
			System.out.println("enter the number of stopovers ");
			int stopovers = scanner.nextInt();
			scanner.nextLine();
			System.out.println("enter the seat number");
			int seatNumber2 = scanner.nextInt();
			
			PlaneTicket planeticket= new PlaneTicket(ref,origin,destination,price,departureTime,arrivalTime,travelClass2,stopovers,seatNumber2);
			System.out.println(planeticket);
			
			break;
		}

	}

}
