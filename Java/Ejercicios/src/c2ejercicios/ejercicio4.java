package c2ejercicios;

import java.util.Scanner;

/*
    Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que
    represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
        a) Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
        b) Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por
           ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté
           vacío.
        c) Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
        d) A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla
           luego de cada reserva.
        e) Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del
           teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los
           asientos ya reservados?

    El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha
    finalizado.
 */
public class ejercicio4 {
    public static void main(String[] args) {
        String msgFila = "Introduce la fila seleciconada: ";
        String msgAsiento = "Introduce el asiento seleciconado: ";
        String msgOcupado = "El asiento seleccionado esta ocupado";
        String msgDisponible = "Se ha realizado con exito la reserva del asiento seleccionado";
        String text1 = "", text2;
        String teatro[][] = new String[5][5];
        int f, a;

        InicializarMatriz(teatro);

        do {
            MostrarMatriz(teatro);
            System.out.println("Introduce salir para terminar");
            text1 = PedirDatos(msgFila);

            if (!text1.equals("salir")) {
                text2 = PedirDatos(msgAsiento);

                try {
                    f = Integer.parseInt(text1) - 1;
                    a = Integer.parseInt(text2) - 1;

                    if (f >= 0 && f <= 4 && a >= 0 && a <= 4)
                        if (ModificarMatriz(teatro, f, a))
                            System.out.println(msgDisponible);
                        else
                            System.out.println(msgOcupado);
                    else {
                        System.out.println("El asiento seleccionado no existe");
                        System.out.println("Las filas van del 0 al 4 y los asientos del 0 al 4");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("La fila y el asiento deben de ser numeros");
                }
            }

        } while (!text1.equals("salir"));
    }

    public static void InicializarMatriz(String[][] teatro) {
        for (int x = 0; x < teatro.length; x++)
            for (int y = 0; y < teatro[x].length; y++)
                teatro[x][y] = "O";
    }

    public static void MostrarMatriz(String[][] teatro) {
        System.out.printf("N-");
        for (int x = 1; x < teatro[0].length + 1; x++)
            System.out.printf("" + x);

        System.out.println("-");

        int numF = 1;
        for (String[] f : teatro) {
            System.out.printf((numF++) + "|");

            for (String a : f)
                System.out.printf(a);

            System.out.println("|");
        }

        for (int x = 0; x < teatro[0].length + 3; x++)
            System.out.printf("-");

        System.out.println();
    }

    public static Boolean ModificarMatriz(String[][] teatro, int f, int a) {
        if (teatro[f][a].equals("O")) {
            teatro[f][a] = "X";

            return true;
        } else
            return false;
    }

    public static String PedirDatos(String msg) {
        Scanner sc = new Scanner(System.in);

        System.out.printf(msg);
        String aux = sc.next();

        return aux;
    }
}
