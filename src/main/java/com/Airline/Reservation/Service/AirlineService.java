package com.Airline.Reservation.Service;

import org.springframework.stereotype.Component;

import com.Airline.Reservation.Entity.AdminEntity;
import com.Airline.Reservation.Entity.AirlineEntity;

@Component
public interface AirlineService {
	
	AirlineEntity reservation(AirlineEntity sb);
	AirlineEntity get(int id);
	AdminEntity search(int id);
	AdminEntity Insert(AdminEntity sb);
	AdminEntity Update(AdminEntity sb, int Flight_id);
	String Delete(int Flight_id);


}
