package com.Airline.Reservation.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Adminrecords")
public class AdminEntity {
	@Id
	private int flight_id;
	private String flight_name;
	@JsonFormat(pattern = "yyyy-MM-dd", shape=Shape.STRING)
	@Temporal(TemporalType.DATE)
	private Date flight_Date;
	private String flight_From;
	private String flight_To;
	private String board_time;
	

	
	
}
