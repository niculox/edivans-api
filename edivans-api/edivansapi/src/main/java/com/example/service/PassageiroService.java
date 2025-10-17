package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Passageiro;
import com.example.repository.PassageiroRepository;

@Service
public class PassageiroService {

    @Autowired
    private PassageiroRepository passageiroRepository;

    public Passageiro cadastrarPassageiro(){
        Passageiro passageiro = passageiroRepository.save(new Passageiro());
        return passageiro;
    }

    public void editarPassageiro(Passageiro passageiro){
        passageiroRepository.save(passageiro);
    }

    public void deletarPassageiro(Integer id_passageiro){
        Passageiro passageiro = passageiroRepository.findById(id_passageiro)
            .orElseThrow(() -> new RuntimeException("Passageiro não encontrado!"));

        passageiroRepository.delete(passageiro);
    }

    public Passageiro buscarPassageiroPorId(Integer id_passageiro){
        return passageiroRepository.findById(id_passageiro)
            .orElseThrow(() -> new RuntimeException("Passageiro não encontrado!"));
    }

}
