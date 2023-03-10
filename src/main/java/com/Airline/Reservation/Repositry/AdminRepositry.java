package com.Airline.Reservation.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Airline.Reservation.Entity.AdminEntity;

public interface AdminRepositry extends JpaRepository<AdminEntity, Integer> {

}
