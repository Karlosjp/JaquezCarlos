package c2ejercicios;

import java.util.Scanner;

/*
    a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios
       productos comprados por un cliente.
    - Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida
      finalizar. Luego, muestra el total de la compra que debe abonar.
*/
public class ejercicio2 {
    public static void main(String[] args) {
        double dato = 1;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        while (dato != 0) {
            System.out.println("---- Introduce 0 para terminar ----");

            System.out.print("Introduce el precio: ");
            dato = sc.nextDouble();

            if (dato != 0)
                total += dato;
        }

        System.out.println("El total  a pagar es: " + total);
    }
}
