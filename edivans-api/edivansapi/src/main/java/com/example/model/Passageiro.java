package com.example.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Passageiro extends AbstractEntity<Integer> {
    private String nome_completo;
    private String cpf;
    private String telefone;
}
