package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Viagem;
import com.example.service.ViagemService;

@RestController
@RequestMapping("/viagens")
public class ViagemController {
    
    @Autowired
    private ViagemService viagemService;

    @PostMapping
    public Viagem criarViagem(){
        return viagemService.criarViagem();
    }

    @GetMapping("/{id}")
    public Viagem buscarViagemPorId(Integer id_viagem){
        return viagemService.buscarViagemPorId(id_viagem);
    }

    @PostMapping("/editar")
    public void editarViagem(Viagem viagem){
        viagemService.editarViagem(viagem);
    }

    @PostMapping("/deletar/{id}")
    public void deletarViagem(Integer id_viagem){
        viagemService.deletarViagem(id_viagem);
    }

}
