package com.klu.repository;


import com.klu.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoonRepository extends JpaRepository<Booking, Long> {}
