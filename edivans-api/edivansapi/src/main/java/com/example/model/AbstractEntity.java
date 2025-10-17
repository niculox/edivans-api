package com.example.model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data // anotação do lombok que economiza trabalh, gerando automaticaente os getters, setters etc...
@MappedSuperclass // indica que essa classe não será uma entidade direta no banco, mas sim uma superclasse para outras entidades
public abstract class AbstractEntity<ID extends Serializable> implements Serializable{
    //geração de id automático para as entidades que herdarem dessa classe
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
}
