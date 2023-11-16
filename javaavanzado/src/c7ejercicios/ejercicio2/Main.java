package c7ejercicios.ejercicio2;

import java.util.List;
import java.util.Scanner;

/*
    Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para crear una estructura
    jerárquica de tareas. Cada tarea puede tener subtareas asociadas, y estas subtareas también pueden tener sus
    propias subtareas, creando así una estructura de "árbol de tareas".

    El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva. Además, debe
    ofrecer la capacidad de visualizar la estructura completa de tareas con sus respectivas subtareas.
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Tarea 1");
        Tarea subTarea1 = new Tarea("Tarea 1");
        Tarea subTarea2 = new Tarea("Tarea 2");
        Tarea subTarea3 = new Tarea("Tarea 3");

        tarea1.agregarTareaAsociada(subTarea1);
        tarea1.agregarTareaAsociada(subTarea2);
        tarea1.agregarTareaAsociada(subTarea3);

        tarea1.agregarTareaAsociada(agregarNuevaTarea());

    }

    public static Tarea agregarNuevaTarea() {
        System.out.print("Nombre para la nueva tarea?: ");
        String name = sc.nextLine();

        return new Tarea(name);
    }

    public static void mostrarTarea(Tarea tarea) {
        ExploradorTareas.mostrarEstructuraTarea(tarea);
    }

    public static void buscarTarea(List<Tarea> tareas) {
        System.out.println("Cual es el numero de la tarea?");
        String id = sc.nextLine();

        ExploradorTareas.buscarTarea(tareas, id, 0);
    }

    public static void menu(Tarea tarea) {
        System.out.println("Bienvenido al programa");
        boolean repetir = true;

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1- Agregar tarea" +
                    "\n2- Ver arbol de tareas" +
                    "\n3- Ver tarea especifica" +
                    "\n4- Salir");
            int respuesta = sc.nextInt();

            if (respuesta == 4)
                repetir = false;
            else if (respuesta > 0 && respuesta < 4)
                switch (respuesta) {
                    case 1:
                        agregarNuevaTarea();
                        break;
                    case 2:
                        mostrarTarea(tarea);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
            else
                System.out.println("Opcion no encontrada.");
        } while (repetir);

        System.out.println("Adios.");
    }
}
