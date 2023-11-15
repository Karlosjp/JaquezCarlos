package c6ejercicios.ejercicio1;

/*
    Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con
    atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos
    para realizar las siguientes operaciones:
        1- Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
        2- Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro
           del inventario.
        3- Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos
           los autos en el inventario.
 */

public class Main {
    public static void main(String[] args) {
        InventarioAutos<Camion> inventarioCamiones = new InventarioAutos<>();

        inventarioCamiones.agregarAInventario(
                new Camion("Marca 1", "Modelo 1", 2018, 25000.0, "Patata m1"));
        inventarioCamiones.agregarAInventario(
                new Camion("Marca 2", "Modelo 5", 2023, 50000.0, "Patata m2"));
        inventarioCamiones.agregarAInventario(
                new Camion("Marca 1", "Modelo 4", 2020, 40000.0, "Patata m1"));
        inventarioCamiones.agregarAInventario(
                new Camion("Marca 3", "Modelo 2", 2022, 35000.0, "Patata m3"));
        inventarioCamiones.agregarAInventario(
                new Camion("Marca 2", "Modelo 1", 2019, 20000.0, "Patata m2"));

        String filtroMarca = "Marca 1";
        int filtroAnno = 2023;

        System.out.println("Filtrados por marca " + filtroMarca + ", son: ");
        inventarioCamiones.buscarPorMarca(filtroMarca).stream()
                .forEach(System.out::println);

        System.out.println("Filtrados por año " + filtroAnno + ", son: ");
        inventarioCamiones.buscarPorAnno(filtroAnno).stream()
                .forEach(System.out::println);

        System.out.println("El valor total del inventario de camiones es: " + inventarioCamiones.valorTotal() + "€");
    }
}
