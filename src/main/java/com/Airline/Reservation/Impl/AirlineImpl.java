package com.Airline.Reservation.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Airline.Reservation.Entity.AdminEntity;
import com.Airline.Reservation.Entity.AirlineEntity;
import com.Airline.Reservation.Repositry.AdminRepositry;
import com.Airline.Reservation.Repositry.AirlineRepositry;
import com.Airline.Reservation.Service.AirlineService;

@Service
public class AirlineImpl implements AirlineService{
	
	@Autowired
	AirlineRepositry adr;

	@Autowired
	AdminRepositry br;
	
	@Override
	public AirlineEntity reservation(AirlineEntity sb) {
		// TODO Auto-generated method stub
		return adr.save(sb);
	}
	@Override
	public AirlineEntity get(int id) {
		// TODO Auto-generated method stub
		return adr.findById(id).get();

	}
	@Override
	public AdminEntity Insert(AdminEntity sb) {
		return br.save(sb);
	}
	@Override
	public AdminEntity Update(AdminEntity sb, int id) {
		// TODO Auto-generated method stub
		AdminEntity Ae1 = br.findById(id).get();
		Ae1.setFlight_id(sb.getFlight_id());
		Ae1.setFlight_name(sb.getFlight_name());
		Ae1.setFlight_Date(sb.getFlight_Date());
		Ae1.setFlight_From(sb.getFlight_From());
		Ae1.setFlight_To(sb.getFlight_To());
		Ae1.setBoard_time(sb.getBoard_time());
		return br.save(Ae1);
	}
	@Override
	public String Delete(int Flight_id) {
		br.deleteById(Flight_id);
		return "Flight_id: " + Flight_id + "is deleted...";
	}
	@Override
	public AdminEntity search(int id) {
		// TODO Auto-generated method stub
		return br.findById(id).get();
	}

	
}
