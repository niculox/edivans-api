package com.example.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Reserva extends AbstractEntity<Integer> {
    private Passageiro passageiro;
    private Viagem viagem;
}
