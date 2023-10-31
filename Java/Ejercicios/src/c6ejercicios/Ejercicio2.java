package c6ejercicios;

import c6ejercicios.ej2.Producto;

import java.util.ArrayList;

/*
    Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario.
    Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca,
    tipo, precio costo, precio venta, cantidad en stock.
    A partir de esto, realizar las siguientes acciones en el programa desarrollado:
        g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        // b) Guardar estos objetos creados en un ArrayList.
        ArrayList<Producto> productos = new ArrayList<>();

        // a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados
        productos.add(new Producto(5, 55.4, 89.99, "Auriculares", "Gamingtocaros", "Auriculares/Cascos"));
        productos.add(new Producto(1, 300.0, 450.95, "Ultrabook basic", "HP", "Portatil"));
        productos.add(new Producto(1, 700.0, 2000.0, "Iphone 80", "Manzanita", "Teléfono"));
        productos.add(new Producto(1, 4.0, 100.0, "Mejor compra pc nuevo", "HP", "Cargador"));
        productos.add(new Producto(1, 1000.0, 1699.99, "Galaxy 85.10.1", "Samsumg", "Teléfono"));
        productos.add(new Producto(1, 0.01, 15.0, "Gaming Pro Ultra 4k DLLS", "Gatiyo", "Auriculares/Cascos"));
        productos.add(new Producto(1, 1000.0, 2599.99, "Tuf gamming", "Asus", "Portatil"));
        productos.add(new Producto(1, 150.0, 300.0, "B550Mx", "Audio-technica", "Auriculares/Cascos"));
        productos.add(new Producto(1, 50.0, 299.99, "Galaxy tap 50", "Samsumg", "Tablet"));
        productos.add(new Producto(1, 15.5, 119.99, "Cargador basico 30w", "Manzanita", "Cargador"));

        // c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
        Producto precioMayor = productos.get(0);
        for (Producto p : productos)
            if (p.getPrecioVenta() > precioMayor.getPrecioVenta())
                precioMayor = p;

        System.out.println("El producto con mayor precio de venta es: " + precioMayor);

        // d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.
        Producto costoMenor = productos.get(0);
        for (Producto p : productos)
            if (p.getPrecioCosto() < costoMenor.getPrecioCosto())
                costoMenor = p;

        System.out.println("El producto con menor precio costo es: " + costoMenor);

        // e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
        productos.remove(5);

        // f) Determinar el producto que tenga la mayor cantidad en stock.
        Producto stockMayor = productos.get(0);
        for (Producto p : productos)
            if (p.getStock() > stockMayor.getStock())
                stockMayor = p;

        System.out.println("El producto con mayor stock: " + stockMayor);

        // A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista con base en eso.
        if (stockMayor.getStock() > 3)
            productos.get(productos.indexOf(stockMayor)).setStock(stockMayor.getStock() - 3);

        for (Producto p : productos)
            System.out.println(p);
    }
}
