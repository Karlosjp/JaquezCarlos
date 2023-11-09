package c5ejercicios;

/*
    Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos
    y constructores correspondientes). Agregar también un método llamado saludar que emita un mensaje por pantalla que
    diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:
        a) Crear sus clases hijas que compartan sus atributos y métodos:
            "Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
            "Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
            "Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
        b) Una vez creadas las clases, crear los siguientes métodos:
            "Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
            "Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
            "Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
        e) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a
           estos métodos.
           - ¿Qué sucede? -> No puedo usar @Override en las subclases y me obliga a hacer el metodo de animal a
              protected y abstract
           - ¿Es posible hacer esto? -> Desde main no se pueden acceder a metodos private de otras clases.
 */

import c5ejercicios.ej1.Animal;
import c5ejercicios.ej1.Ave;
import c5ejercicios.ej1.Mamifero;
import c5ejercicios.ej1.Reptil;

public class Ejercicio1 {
    public static void main(String[] args) {
        // c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
        Mamifero mamifero = new Mamifero(1, 2, "Mamifero 1", "Tipo 1", "Alimentacion 1", 4, "Sexual", "Marron", "Pradera");
        Ave ave = new Ave(1, 5, "Ave 1", "Tipo 2", "Alimentacion 2", 2, "Vuelo 1", "Blanco", "Tipo 1");
        Reptil reptil = new Reptil(3, 1, "Reptil 1", "Tipo 5", "Alimentacion 3", 1.5, "Tipo 10", "Habitad 2");

        System.out.println(mamifero.Saludar());
        System.out.println(ave.Saludar());
        System.out.println(reptil.Saludar());

        // d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado…
        Animal animal1 = mamifero;
        /*
            - ¿Qué sucede? -> Se asigna sin problema
            - ¿Es posible hacer esto? -> Si, al ser una herencia de animal se pueden asignar a objetos animal, pero no
              se podran usar los metodos propios de mamifero
            - ¿Se aplica alguna propiedad para esto? -> Para asignarlo no es necesario agregar nada mas. Pero para
              utilizar los atributos y metodos de la clase mamifero hay que castearla a Mamifero porque en animal no
              existen.
        */
    }
}
