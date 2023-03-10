package com.Airline.Reservation.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Reservation")
public class AirlineEntity {
	
	@Id
	private int id;
	private String cust_name;
	private long mobile_no;

	@ManyToMany
	@JoinTable(name="user_Flight",joinColumns=@JoinColumn(name="id"),inverseJoinColumns=@JoinColumn(name="Flight_id"))
	private List<AdminEntity> adminentity = new ArrayList<>();
	
	
	
}
