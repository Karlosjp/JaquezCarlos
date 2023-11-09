package c1ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los usuarios
    pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la
    cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos
    ingresados y manejando excepciones en caso de errores o datos inválidos.

    Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada) o de
    utilizar los tipos correctos de excepción en cada caso.
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Producto> listProductos = new ArrayList<>();

        Producto producto1 = crearProducto();
        if (producto1 != null)
            listProductos.add(producto1);

        Producto producto2 = crearProducto();
        if (producto2 != null)
            listProductos.add(producto2);

        Producto producto3 = crearProducto();
        if (producto3 != null)
            listProductos.add(producto3);

        listProductos.forEach(producto -> System.out.println(producto));
    }

    private static Producto crearProducto() {
        Producto nuevoProducto = null;
        try {
            System.out.println("Que producto quieres agregar?: ");

            System.out.print("Nombre: ");
            String nombre = introducirDatosString();

            System.out.print("Precio: ");
            double precio = introducirDatosDouble();

            System.out.print("Cantidad: ");
            int cantidad = introducirDatosInteger();

            nuevoProducto = new Producto(nombre, precio, cantidad);
        } catch (DatoInvalidoExcepton e) {
            System.err.println(e.getMessage());
        }

        System.out.println("El producto se ha creado");

        return nuevoProducto;
    }

    public static String introducirDatosString() throws DatoInvalidoExcepton {

        String entrada = sc.nextLine();

        if (!entrada.isEmpty() && !(entrada == null)) return entrada;
        else throw new DatoInvalidoExcepton("El dato introducido es incorrecto");
    }

    public static Integer introducirDatosInteger() throws DatoInvalidoExcepton {
        try {
            String entrada = sc.nextLine();

            if (!entrada.isEmpty() && !(entrada == null)) {
                int num = Integer.parseInt(entrada);

                return num;
            } else throw new DatoInvalidoExcepton("El dato introducido es incorrecto");
        } catch (NumberFormatException nfe) {
            throw new DatoInvalidoExcepton("El numero introducido es incorrecto.");
        }
    }

    public static Double introducirDatosDouble() throws DatoInvalidoExcepton {
        try {
            String entrada = sc.nextLine();

            if (!entrada.isEmpty() && !(entrada == null)) {
                double num = Double.parseDouble(entrada);

                return num;
            } else throw new DatoInvalidoExcepton("El dato introducido es incorrecto");
        } catch (NumberFormatException nfe) {
            throw new DatoInvalidoExcepton("El numero introducido es incorrecto.");
        }
    }
}
