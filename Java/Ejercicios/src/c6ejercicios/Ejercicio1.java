package c6ejercicios;

/*
    Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de
    venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar
    este sistema.
        a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa,
           marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
        b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y
           recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases, deben
           mostrar un mensaje de qué tipo de recarga están haciendo.
        c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos
           específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los
           métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
        d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega
           atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible.
           Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
        e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos
           específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de
           la clase abstracta y los de la interfaz.
        f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas
           de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre
           cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según
           corresponda.
        g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.
 */

import c6ejercicios.ej1.Auto;
import c6ejercicios.ej1.Camioneta;
import c6ejercicios.ej1.Moto;
import c6ejercicios.ej1.Vehiculo;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto(2020, 83500.0, "APX 1234", "Patata", "Andante", 3000.0, 50.5));
        vehiculos.add(new Moto(2000, 500.0, "CBY 1234", "Honda", "Model2s", 500, "Tipo 4", 55.1));
        vehiculos.add(new Camioneta(2017, 13500.0, "SWG 1234", "Seat", "Trabajo", 35.0, 2.1));

        for (Vehiculo v : vehiculos) {
            System.out.println(v.CalcularAntiguedad() + " Años de antiguedad");

            if (v instanceof Auto) {
                System.out.println(v);
                System.out.println("Despues de cargar: " + ((Auto) v).cargarEnergia(500.0));
            }

            if (v instanceof Moto) {
                System.out.println(v);
                System.out.println("Despues de cargar: " + ((Moto) v).recargarCombustible(25.5));
            }

            if (v instanceof Camioneta) {
                System.out.println(v);
                System.out.println("Despues de cargar: " + ((Camioneta) v).recargarCombustible(20.9));
            }
        }
    }
}
