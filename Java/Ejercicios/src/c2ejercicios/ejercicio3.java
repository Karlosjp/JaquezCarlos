package c2ejercicios;

import java.util.Scanner;

/*
    - Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
      calcule la temperatura máxima promedio que hubo.
    - Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de
      cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y
      mostrando el resultado por pantalla.
 */
public class ejercicio3 {
    public static void main(String[] args) {
        double temps[] = new double[7], tempMedia = 0;
        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < temps.length; x++) {
            System.out.printf("Escribe el " + (x + 1) + "º dato: ");
            temps[x] = sc.nextDouble();
        }

        for (double temp : temps)
            tempMedia += temp;

        System.out.printf("La temperatura media es de la semana es: ");
        System.out.println(String.format("%.2f", (tempMedia / temps.length)) + "º");

    }
}
