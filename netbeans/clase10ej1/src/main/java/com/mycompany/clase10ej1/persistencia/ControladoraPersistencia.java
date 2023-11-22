/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase10ej1.persistencia;

import com.mycompany.clase10ej1.logica.Partido;
import com.mycompany.clase10ej1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Jaquez
 */
public class ControladoraPersistencia {

    PartidoJpaController partidoJPA = new PartidoJpaController();

    public void crearPartido(Partido partido) {
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

    public List<Partido> listarPartido() {
        return partidoJPA.findPartidoEntities();
    }

    public Partido buscarPartidoById(long id) {
        return partidoJPA.findPartido(id);
    }

}
