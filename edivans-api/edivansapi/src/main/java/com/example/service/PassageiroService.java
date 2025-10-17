package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Passageiro;
import com.example.repository.PassageiroRepository;
import com.example.repository.ReservaRepository;
import com.example.repository.ViagemRepositoy;

@Service
public class PassageiroService {
    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ViagemRepositoy viagemRepositoy;

    @Autowired
    private PassageiroRepository passageiroRepository;

}
