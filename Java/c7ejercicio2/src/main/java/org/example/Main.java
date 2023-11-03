package org.example;

/*
    Un restaurante necesita un programa para almacenar en una base de datos sus diferentes platillos del menú. De cada
    uno de estos se almacena: id, nombre, receta, precio.
    Sabiendo esto:
        - Crear una base de datos llamada restaurante. Dejarla completamente vacía.
        - Realizar las configuraciones necesarias para implementar JPA en el proyecto. Esto incluye:
            - Mapeo mediante annotations
            - Creación de la unidad de persistencia
            - Creación de los paquetes para representar capas (logica y persistencia)
            - Creación de las clases controladoras: para la lógica y para la persistencia.
            - Creación de los respectivos JPA Controller.
            - Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
            - Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
            - Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.
 */

import org.example.logica.Platillo;
import org.example.persistencia.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ControladoraPersistencia controladora = new ControladoraPersistencia();

        Platillo platillo1 = new Platillo(1L, "Platillo 1", "Patata, con patatin y pataton", 25.5);
        Platillo platillo2 = new Platillo(2L, "Platillo 2", "Patatin, con pataton y pataton", 15.5);
        Platillo platillo3 = new Platillo(3L, "Platillo 3", "pataton, con patata y patatin", 40.0);

        controladora.crearPlatillo(platillo1);
        controladora.crearPlatillo(platillo2);
        controladora.crearPlatillo(platillo3);

        controladora.eliminarPlatillo(platillo2.getId());

        platillo1.setNombre("Merluza merluzante");
        platillo1.setPrecio(50.2);
        controladora.editarPlatillo(platillo1);

        List<Platillo> listPlatillo = controladora.listarPlatillos();

        for (Platillo platillo : listPlatillo)
            System.out.println(platillo.getNombre());
    }
}