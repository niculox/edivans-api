package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.PassageiroRepository;
import com.example.repository.ReservaRepository;
import com.example.repository.ViagemRepositoy;

@Service
public class ViagemService {
    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ViagemRepositoy viagemRepositoy;

    @Autowired
    private PassageiroRepository passageiroRepository;

}
