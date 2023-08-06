package com.travelbooking.utilities;

import java.util.Comparator;

import com.travelbooking.domain.TravelTicket;

public class OriginSortComparator implements Comparator<TravelTicket> {

	@Override
	public int compare(TravelTicket o1, TravelTicket o2) {
				return o1.getOrigin().compareTo(o2.getOrigin());
	}

}
