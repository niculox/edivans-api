package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Passageiro;
import com.example.model.Reserva;
import com.example.model.Viagem;
import com.example.repository.PassageiroRepository;
import com.example.repository.ReservaRepository;
import com.example.repository.ViagemRepositoy;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ViagemRepositoy viagemRepositoy;

    @Autowired
    private PassageiroRepository passageiroRepository;


    public Reserva criarReserva(Integer id_viagem, Integer id_passageiro){
        Viagem viagem = viagemRepositoy.findById(id_viagem)
            .orElseThrow(() -> new RuntimeException("Viagem não encontrada!"));

        Passageiro Passageiro = passageiroRepository.findById(id_passageiro)
            .orElseThrow(() -> new RuntimeException("Passageiro não encontrado!"));

        Integer vagasOcupadas = viagem.getVagas_ocupadas();
        if(vagasOcupadas >= viagem.getTotal_vagas()){
            throw new RuntimeException("Não há vagas disponíveis para esta viagem!");
        }

        Reserva reserva = new Reserva();
        reserva.setViagem(viagem);
        reserva.setPassageiro(Passageiro);
        
        return reservaRepository.save(reserva);
    }

    public void editarReserva(Reserva reserva){
        reservaRepository.save(reserva);
    }

    public void cancelarReserva(Integer id_reserva){
        Reserva reserva = reservaRepository.findById(id_reserva)
            .orElseThrow(() -> new RuntimeException("Reserva não encontrada!"));

        reservaRepository.delete(reserva);
    }

    public Reserva buscarReservaPorId(Integer id_reserva){
        return reservaRepository.findById(id_reserva)
            .orElseThrow(() -> new RuntimeException("Reserva não encontrada!"));
    }
    
}
