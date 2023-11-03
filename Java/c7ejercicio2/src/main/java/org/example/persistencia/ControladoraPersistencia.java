package org.example.persistencia;

import org.example.logica.Platillo;

import java.util.List;

public class ControladoraPersistencia {
    PlatilloJPAController platilloJPA = new PlatilloJPAController();

    public void crearPlatillo(Platillo platillo) {
        platilloJPA.create(platillo);
    }

    public void eliminarPlatillo(long id) {
        platilloJPA.destroy(id);
    }

    public void editarPlatillo(Platillo platillo) {
        platilloJPA.edit(platillo);
    }

    public List<Platillo> listarPlatillos() {
        return platilloJPA.findPlatilloEntities();
    }
}
