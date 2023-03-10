package com.Airline.Reservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Airline.Reservation.Entity.AdminEntity;
import com.Airline.Reservation.Entity.AirlineEntity;
import com.Airline.Reservation.Service.AirlineService;

@RestController
public class AirlineController {
	
	@Autowired
	AirlineService As;
		
	@PostMapping("/reservation")
	public AirlineEntity Add(@RequestBody AirlineEntity em) {
		return As.reservation(em);
	}
	@GetMapping("/byid/{id}")
	public AirlineEntity get(@PathVariable int id) {
		return As.get(id);
	}
	@PostMapping("/admin/add")
	public AdminEntity Insert(@RequestBody AdminEntity em) {
		return As.Insert(em);
	}
	@PutMapping("/admin/update/{id}")
	public AdminEntity update(@PathVariable int id, @RequestBody AdminEntity sbe) {
		return As.Update(sbe, id);
	}
	@DeleteMapping("/admin/delete/{id}")
	public String delete(@PathVariable int id) {
		return As.Delete(id);
	}
	@GetMapping("/admin/search/{id}")
	public AdminEntity Search(@PathVariable int id) {
		return As.search(id);
	}
}
