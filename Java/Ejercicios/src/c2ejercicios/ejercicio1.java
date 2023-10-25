package c2ejercicios;

/*
    a) Un recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, a partir de
       que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al
       evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.
*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        String msA = "Puede ingresar", msN = "No se permite la entrada a menores de 18 años";
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        if (edad >= 18)
            System.out.println(msA);
        else
            System.out.println(msN);
    }
}
