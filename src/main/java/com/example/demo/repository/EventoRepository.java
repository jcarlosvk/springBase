package com.example.demo.repository;

import com.example.demo.model.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventoRepository extends JpaRepository<Eventos, Integer> {
    // Aquí puedes definir consultas personalizadas si lo necesitas
    // Ejemplo: List<Eventos> findByModalidad(String modalidad);
}
