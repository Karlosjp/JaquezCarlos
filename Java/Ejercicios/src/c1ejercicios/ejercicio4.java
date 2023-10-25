package c1ejercicios;

import java.util.Scanner;

/*
    - Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes
    operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada
    una de las operaciones con un mensaje amigable para el usuario.
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Escribe el 1º numero: ");
        num1 = sc.nextInt();

        System.out.printf("Escribe el 2º numero: ");
        num2 = sc.nextInt();

        System.out.println("La suma es: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("La resta es: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("La multiplicacion es: " + num1 + " x " + num2 + " = " + num1 * num2);

        // ¿Qué sucede si como segundo número de una división se ingresa 0?
        // Salta una ArithmeticException en la consola
        // ¿De qué manera tratarías de evitar ésta situación?
        if (num2 != 0)
            System.out.println("La division es: " + num1 + " / " + num2 + " = " + num1 / num2);
    }
}
