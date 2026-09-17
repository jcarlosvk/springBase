package com.example.demo.controller;

import com.example.demo.model.Eventos;
import com.example.demo.repository.EventoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    private final EventoRepository eventoRepository;

    // Constructor injection en lugar de @Autowired
    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    // Listar todos los eventos
    @GetMapping
    public List<Eventos> listarEventos() {
        return eventoRepository.findAll();
    }

    // Buscar un evento por ID
    @GetMapping("/{id}")
    public Optional<Eventos> obtenerEvento(@PathVariable Integer id) {
        return eventoRepository.findById(id);
    }

    // Registrar un nuevo evento
    @PostMapping
    public Eventos crearEvento(@RequestBody Eventos evento) {
        return eventoRepository.save(evento);
    }

    // Actualizar un evento existente
    @PutMapping("/{id}")
    public Eventos actualizarEvento(@PathVariable Integer id, @RequestBody Eventos evento) {
        evento.setIdEvento(id);
        return eventoRepository.save(evento);
    }

    // Eliminar un evento
    @DeleteMapping("/{id}")
    public void eliminarEvento(@PathVariable Integer id) {
        eventoRepository.deleteById(id);
    }
}
