package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Reserva;
import com.example.repository.ReservaRepository;

@RestController
@RequestMapping("/reservas")
public class ReservaControler {
    
    @Autowired
    private ReservaRepository reservaRepository;

    @PostMapping
    public Reserva criarReserva(){
        return reservaRepository.save(new Reserva());
    }

    @GetMapping("/{id}")
    public Reserva buscarReservaPorId(Integer id_reserva){
        return reservaRepository.findById(id_reserva).orElseThrow(() -> new RuntimeException("Reserva não encontrada!"));
    }

    @PostMapping("/editar")
    public void editarReserva(Reserva reserva){
        reservaRepository.save(reserva);
    }

    @PostMapping("/deletar/{id}")
    public void deletarReserva(Integer id_reserva){
        Reserva reserva = reservaRepository.findById(id_reserva)
            .orElseThrow(() -> new RuntimeException("Reserva não encontrada!"));

        reservaRepository.delete(reserva);
    }
}
