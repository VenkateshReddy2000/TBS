package com.travelbooking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import com.travelbooking.bookingprocess.BookingSystem;
import com.travelbooking.bookingprocess.CheapTravelBookingSystem;
import com.travelbooking.bookingprocess.EnjoyableToursBookingSystem;
import com.travelbooking.domain.BusTicket;
import com.travelbooking.domain.PlaneTicket;
import com.travelbooking.domain.TrainTicket;
import com.travelbooking.domain.TravelClass;
import com.travelbooking.domain.TravelTicket;
import com.travelbooking.exceptions.InvalidTravelDurationException;

public class Main {

	public static void main(String[] args) throws InvalidTravelDurationException {

		TrainTicket trainTicket = new TrainTicket();
		trainTicket.cancel();

		TrainTicket trainTicket2 = null;
		try {
			trainTicket2 = new TrainTicket(123L,"London","Oval", new BigDecimal("59.66"),LocalDateTime.of(2022, 7, 3, 18, 45),LocalDateTime.of(2022, 7, 3, 19, 45),TravelClass.FIRST,3,45);
			trainTicket2.upgrade();
			trainTicket2.cancel();	} catch (InvalidTravelDurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		//String[] providers = {"First bus company ","second bus company"};

		ArrayList providers = new ArrayList();
		providers.add("First bus company");
		providers.add("Second bus company");
		providers.add("third bus company");
		
		System.out.println(providers.size());
		System.out.println(providers);
		
		providers.remove(1);
		System.out.println(providers.size());
		System.out.println(providers);
		
		BusTicket busTicket;
		
			busTicket = new BusTicket(124L,"London","Oval", new BigDecimal("59.66"),LocalDateTime.of(2022, 7, 3, 18, 45),LocalDateTime.of(2023, 8, 3, 21, 15),providers);
			
			BusTicket busTicket2 = new BusTicket(125L,"new york","new jersey", new BigDecimal("59.66"),LocalDateTime.of(2022, 7, 3, 18, 45),LocalDateTime.of(2023, 8, 3, 21, 15),providers);
			
			BusTicket busTicket3 = new BusTicket(126L,"paris","calaris", new BigDecimal("59.66"),LocalDateTime.of(2022, 7, 3, 18, 45),LocalDateTime.of(2023, 8, 3, 21, 15),providers);
			
          List<TravelTicket> tickets = new ArrayList<>();
        
		  
		   tickets.add(busTicket);
           tickets.add(busTicket2);
           tickets.add(busTicket3);
            tickets.add(trainTicket2);
           
//           System.out.println(busTickets.get(1));
//           for (int i = 0; i <busTickets.size(); i++) {
//			System.out.println(busTickets.get(i));
//		}
//          
            //Collections.sort(tickets);
            
           //Collections.sort(tickets,new OriginSortComparator());
            
            Collections.sort(tickets, new Comparator<TravelTicket>() {

				@Override
				public int compare(TravelTicket o1, TravelTicket o2) {
					
					return o1.getDestination().compareTo(o2.getDestination());
				}
            	
            });
            
           for( TravelTicket b : tickets) {
			System.out.println(b);
			
		}
           
           tickets.stream().forEach(a -> System.out.println(a));
           
           System.out.println("------");
           
           tickets.stream().filter(a -> a.getOrigin().equals("London")).forEach(a -> System.out.println(a));
           System.out.println("------");
           List<TravelTicket> londonTickets= tickets.stream().filter(a -> a.getOrigin().equals("London")).toList();
            for (TravelTicket t : londonTickets) {
				System.out.println(t);
			}
         tickets.stream().map(a->{
        	a.setPrice(a.getPrice().add(new BigDecimal("20")));
        	 return a;
         }).forEach(a-> System.out.println(a));
         
            
//      TravelTicket foundTicket = tickets.get(2);
//      System.out.println(foundTicket);
//      
//      if(foundTicket instanceof TrainTicket) {
//    	  System.out.println("this is a train ticket");
//      }
//      else if(foundTicket instanceof BusTicket) {
//    	  System.out.println("this is a bus ticket");
//    	  BusTicket foundBusTicket = (BusTicket) foundTicket;
//    	  System.out.println(foundBusTicket.getPermittedProviders());
//      }else {
//    	  System.out.println("this is a plane ticket");
//      }
//      BusTicket busTicket4= new BusTicket(foundTicket,providers);
//      
//      BookingSystem bookingSystem = new CheapTravelBookingSystem();
//      
//      bookingSystem.setTravelTicket(busTicket4);
//      bookingSystem.requestBooking();
//      System.out.println("The booking status is  " + bookingSystem.getStatus());
//      
//      List<Integer> integerList1 = new ArrayList<>();
//      integerList1.add(1);
//      integerList1.add(2);
//      integerList1.add(3);
//      integerList1.add(4);
//      integerList1.add(5);
//      
      
     
      
//      List<Integer> integerList2 = List.of(1,2,3,4,5);
//      for (Integer i : integerList2) {
//		System.out.println(i);
//	}
//      
//      System.out.println(integerList2.getClass());
//      
//      integerList1.add(6);
//     
//      
//      System.out.println(BookingSystem.getVersion());
//      
//      BookingSystem bookingSystem2 = BookingSystem.of(trainTicket);
      
	}

}
