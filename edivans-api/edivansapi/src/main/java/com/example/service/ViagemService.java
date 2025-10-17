package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Viagem;
import com.example.repository.ViagemRepositoy;

@Service
public class ViagemService {

    @Autowired
    private ViagemRepositoy viagemRepositoy;

    public Viagem criarViagem(Viagem viagem){
        return viagemRepositoy.save(viagem);
    }

    public void editarViagem(Viagem viagem){
        viagemRepositoy.save(viagem);
    }

    public void deletarViagem(Integer id_viagem){
        Viagem viagem = viagemRepositoy.findById(id_viagem)
            .orElseThrow(() -> new RuntimeException("Viagem não encontrada!"));

        viagemRepositoy.delete(viagem);
    }

    public Viagem buscarViagemPorId(Integer id_viagem){
        return viagemRepositoy.findById(id_viagem)
            .orElseThrow(() -> new RuntimeException("Viagem não encontrada!"));
    }
    
}
