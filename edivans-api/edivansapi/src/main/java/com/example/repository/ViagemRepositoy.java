package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Viagem;

@Repository
public interface ViagemRepositoy extends JpaRepository<Viagem, Integer>{}
