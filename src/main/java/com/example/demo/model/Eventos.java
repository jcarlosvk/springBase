package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sea_eventos", schema = "public")
public class Eventos {

    @Id
    @Column(name = "id_evento")
    private Integer idEvento;

    @Column(name = "nombre_evento", nullable = false, length = 200)
    private String nombreEvento;

    @Column(name = "fec_inicio")
    private LocalDateTime fecInicio;

    @Column(name = "fec_fin")
    private LocalDateTime fecFin;

    @Column(name = "fec_registro")
    private LocalDateTime fecRegistro;

    @Column(name = "fec_modificacion")
    private LocalDateTime fecModificacion;

    // --- Getters y Setters ---
    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public LocalDateTime getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(LocalDateTime fecInicio) {
        this.fecInicio = fecInicio;
    }

    public LocalDateTime getFecFin() {
        return fecFin;
    }

    public void setFecFin(LocalDateTime fecFin) {
        this.fecFin = fecFin;
    }

    public LocalDateTime getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(LocalDateTime fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    public LocalDateTime getFecModificacion() {
        return fecModificacion;
    }

    public void setFecModificacion(LocalDateTime fecModificacion) {
        this.fecModificacion = fecModificacion;
    }
}
