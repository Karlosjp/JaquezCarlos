package c5ejercicios;

/*
    Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos
    y constructores correspondientes).
        a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
            - Zapato: material, tipoCierre
            - Pantalon: estilo, tipoTejido
            - Camiseta: manga, cuello
            - Sombrero: tipo, tamaño

        c) Crear los siguientes métodos (en cada subclase correspondiente):
            - Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar
              marca).
            - Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar
              estilo).
            - Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar
              manga).
            - Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar
              tipo).

 */

import c5ejercicios.ej2.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Vestimenta[] vestimentas = new Vestimenta[9];

        // b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos,
        //    3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
        vestimentas[0] = new Zapato(22.5, "41", "Chancla", "Patata", "Azul", "Material 1", "Abierto");
        vestimentas[1] = new Zapato(10.0, "30", "Pantufla", "Pititi", "Beis", "Material 4", "Cerrado");
        vestimentas[2] = new Zapato(6.0, "25", "Tenis", "Patatin", "Turquesa", "Material 8", "Cerrado");
        vestimentas[3] = new Pantalon(60.0, "XL", "Pantalon Patata", "Nisu", "Rosa pasion", "Pitillo", "Leggins");
        vestimentas[4] = new Pantalon(45.0, "L", "Libre imaginacion", "Noso", "Azul verdeo", "Mono", "Vaquero");
        vestimentas[5] = new Pantalon(20.3, "XXL", "Catedral edad media", "Nusi", "Amarillo moco", "Campana", "Algodon");
        vestimentas[6] = new Camiseta(10.0, "XL", "Top1", "Patatesion", "Fucsia", "Corta", "Alto");
        vestimentas[7] = new Camiseta(4.5, "XS", "Termica", "Termomirl", "Negro", "Larga", "Alto");
        vestimentas[8] = new Sombrero(199.99, "Unica", "Mas-cara", "Mamei", "Negro, como tu alma =D", "Tipo 1", 35.5);

        // d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
        for (Vestimenta v : vestimentas)
            System.out.println(v.getInfor());
    }
}
