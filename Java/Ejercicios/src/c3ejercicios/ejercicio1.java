package c3ejercicios;

/*
    Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde)
    con los siguientes atributos: cod, marca, modelo, consumo y color.
    Luego, realiza las siguientes acciones:
*/

public class ejercicio1 {
    public static void main(String[] args) {
        // a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        Electrodomestico[] electros = new Electrodomestico[3];
        electros[0] = new Electrodomestico(1, "Nisu", "Patata1", "Mucho", "Mamei");
        electros[1] = new Electrodomestico(2, "Fruta", "Patata2", "Poco", "Zigzag");
        electros[2] = new Electrodomestico(3, "Wafle", "Patata3", "Eso se come?", "Glork");
        // b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        Electrodomestico electrodomestico = new Electrodomestico();

        // c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        for (Electrodomestico electro : electros)
            System.out.println(electro);
        // d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
        System.out.println(electrodomestico.getMarca());
        // ¿Se obtiene algún valor? Si
        // ¿Qué valor se obtiene? Lo que se ha puesto en el constructor vacio.
        // En este caso lo he inicialozado con "No especificado"
    }
}
