package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {}
