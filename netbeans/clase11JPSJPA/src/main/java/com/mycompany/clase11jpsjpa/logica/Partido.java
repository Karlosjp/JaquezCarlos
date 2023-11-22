/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11jpsjpa.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Carlos Jaquez
 */
@Entity
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String fecha;
    private String resultado;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipo_local;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante")
    private Equipo equipo_visitante;

    public Partido() {
    }

    public Partido(Long id, String codigo, String fecha, String resultado, Equipo equipo_local, Equipo equipo_visitante) {
        this.id = id;
        this.codigo = codigo;
        this.fecha = fecha;
        this.resultado = resultado;
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Equipo getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(Equipo equipo_local) {
        this.equipo_local = equipo_local;
    }

    public Equipo getEquipo_visitante() {
        return equipo_visitante;
    }

    public void setEquipo_visitante(Equipo equipo_visitante) {
        this.equipo_visitante = equipo_visitante;
    }

}
