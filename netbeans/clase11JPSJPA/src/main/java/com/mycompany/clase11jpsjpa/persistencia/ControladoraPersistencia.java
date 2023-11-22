/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11jpsjpa.persistencia;

import com.mycompany.clase11jpsjpa.logica.Equipo;
import com.mycompany.clase11jpsjpa.logica.Partido;
import com.mycompany.clase11jpsjpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Jaquez
 */
public class ControladoraPersistencia {

    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA = new PartidoJpaController();

// <editor-fold defaultstate="collapsed" desc="Persistencia Equipo methods. Click on the + sign on the left to edit the code.">
    public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }

    public void eliminarEquipo(long id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEquipo(Equipo equipo) {
        try {
            equipoJPA.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Equipo> listarEquipos() {
        return equipoJPA.findEquipoEntities();
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Persistencia Partido methods. Click on the + sign on the left to edit the code.">
    public void crearPartido(Partido partido, Long idEquipo1, Long idEquipo2) {
        Equipo eq1 = equipoJPA.findEquipo(idEquipo1);
        Equipo eq2 = equipoJPA.findEquipo(idEquipo2);
        partido.setEquipo_local(eq1);
        partido.setEquipo_visitante(eq2);
        
        partidoJPA.create(partido);
    }

    public void eliminarPartido(long id) {
        try {
            partidoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPartido(Partido partido) {
        try {
            partidoJPA.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Partido> listarPartidos() {
        return partidoJPA.findPartidoEntities();
    }// </editor-fold>

}
