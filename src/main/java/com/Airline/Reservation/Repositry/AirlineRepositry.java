package com.Airline.Reservation.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Airline.Reservation.Entity.AirlineEntity;

public interface AirlineRepositry extends JpaRepository<AirlineEntity, Integer> {




}
