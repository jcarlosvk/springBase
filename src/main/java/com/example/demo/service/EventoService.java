package com.example.demo.service;

import com.example.demo.model.Eventos;
import com.example.demo.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    private final EventoRepository eventoRepository;

    // Constructor injection en lugar de @Autowired en el campo
    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    // Listar todos los eventos
    public List<Eventos> listarEventos() {
        return eventoRepository.findAll();
    }

    // Buscar un evento por ID
    public Optional<Eventos> obtenerEvento(Integer id) {
        return eventoRepository.findById(id);
    }

    // Crear un nuevo evento
    public Eventos crearEvento(Eventos evento) {
        return eventoRepository.save(evento);
    }

    // Actualizar un evento existente
    public Eventos actualizarEvento(Integer id, Eventos evento) {
        evento.setIdEvento(id);
        return eventoRepository.save(evento);
    }

    // Eliminar un evento
    public void eliminarEvento(Integer id) {
        eventoRepository.deleteById(id);
    }
}