package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Passageiro;
import com.example.service.PassageiroService;

@RestController
@RequestMapping("/passageiros")
public class PassageiroController {
    
    @Autowired
    private PassageiroService passageiroService;

    @PostMapping
    public Passageiro cadastrarPassageiro(){
        return passageiroService.cadastrarPassageiro();
    }

    @GetMapping("/{id}")
    public Passageiro buscarPassageiroPorId(Integer id_passageiro){
        return passageiroService.buscarPassageiroPorId(id_passageiro);
    }

    @PostMapping("/editar")
    public void editarPassageiro(Passageiro passageiro){
        passageiroService.editarPassageiro(passageiro);
    }

    @PostMapping("/deletar/{id}")
    public void deletarPassageiro(Integer id_passageiro){
        passageiroService.deletarPassageiro(id_passageiro);
    }

}
