package c1ejercicios.ejercicio3;

/*
    Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un vector y
    acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar datos en un vector y
    manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
        1 - Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño
            fijo para simplificar el ejercicio.
        2 - Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando
            un índice.
        3 - Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el vector,
            por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.
        4 - Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando acceder
            a una posición inválida en el vector.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] vectorString = new String[5];
        Scanner sc = new Scanner(System.in);

        vectorString = almacenar(vectorString, sc);

        leerVector(vectorString, sc);

        sc.close();
    }

    public static String[] almacenar(String[] vectorString, Scanner sc) {
        Boolean repetir = true;
        int pos = 0;

        while (repetir) {
            System.out.println("Que deseas almacenar?, (Introduce 'salir' para terminar");
            System.out.print("Dato: ");
            try {
                String entrada = sc.nextLine();

                if (!entrada.toLowerCase().equals("salir")) {
                    vectorString[pos] = entrada;
                    pos++;
                } else repetir = false;
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.err.println("No se pueden almacenar mas datos. " + aie.getMessage());
            }
        }

        return vectorString;
    }

    public static void leerVector(String[] vectorString, Scanner sc) {
        Boolean repetir = true;

        while (repetir) {
            System.out.println("Que dato deseas leer?, (Introduce 'salir' para terminar");
            System.out.print("Indice: ");
            try {
                String entrada = sc.nextLine();

                if (!entrada.equals("salir")) {
                    int indice = Integer.parseInt(entrada);
                    System.out.println(vectorString[indice]);
                } else repetir = false;
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.err.println("No se encuentra el indice. " + aie.getMessage());
            } catch (NumberFormatException nfe) {
                System.err.println("El indice debe de ser un numero. " + nfe.getMessage());
            }
        }
    }
}
