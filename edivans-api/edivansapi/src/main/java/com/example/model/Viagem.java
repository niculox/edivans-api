package com.example.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Viagem extends AbstractEntity<Integer> {
    private String origem;
    private String destino;
    private String data_hora_partida;
    private Integer total_vagas = 18;
    private Integer vagas_ocupadas = 0;
    private Float preco;
}
