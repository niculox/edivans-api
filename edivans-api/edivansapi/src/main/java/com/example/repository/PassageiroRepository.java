package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Passageiro;

@Repository
public interface PassageiroRepository extends JpaRepository<Passageiro, Integer> {}
