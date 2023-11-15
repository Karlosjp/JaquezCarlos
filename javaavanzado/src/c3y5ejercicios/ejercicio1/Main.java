package c3y5ejercicios.ejercicio1;

/*
    Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una
    categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando
    Streams y Optionals:
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listEmpleados = new ArrayList<>();
        Double salarioFiltro = 1300.0;

        listEmpleados.add(new Empleado("Carlos", 1200.0, "Desarrollador"));
        listEmpleados.add(new Empleado("Anny", 2000.0, "Gerente"));
        listEmpleados.add(new Empleado("Juan", 1500.0, "Analista"));
        listEmpleados.add(new Empleado("Mario", 1200.0, "Desarrollador"));
        listEmpleados.add(new Empleado("Josue", 1500.0, "Analista"));

        // - Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        listEmpleados.stream()
                .filter(empleado -> empleado.getSalario() > salarioFiltro)
                .forEach(System.out::println);

        // - Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        /*
        List<Empleado> listaDesarrollador = filtrarCategoria("Desarrollador", listEmpleados);
        List<Empleado> listaDGerente = filtrarCategoria("Gerente", listEmpleados);
        List<Empleado> listaAnalista = filtrarCategoria("Analista", listEmpleados);

        mediaSalario(listaDesarrollador);
        mediaSalario(listaDGerente);
        mediaSalario(listaAnalista);
        */
        listEmpleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria))
                .entrySet()
                .stream()
                .map(e -> e.getValue()
                        .stream()
                        .mapToDouble(empleado -> empleado.getSalario())
                        .average()
                        .orElse(0))
                .forEach(media -> System.out.println("El promedio de la categoria es: " + media));

        // - Encuentra al empleado con el salario más alto utilizando Optionals.
        listEmpleados.stream()
                .sorted(Comparator.comparing(Empleado::getSalario).reversed())
                .findFirst()
                .ifPresentOrElse(empleado -> System.out.println("El empleado con el salario más alto es: " + empleado),
                        () -> System.out.println("No hay datos"));
    }

    public static void mediaSalario(List<Empleado> lista) {
        lista.stream().mapToDouble(e -> e.getSalario())
                .average()
                .ifPresentOrElse(value -> System.out.println("El promedio es:" + value),
                        () -> System.out.println("No hay datos"));
    }

    public static List<Empleado> filtrarCategoria(String cat, List<Empleado> lista) {
        return lista.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase(cat))
                .toList();
    }
}
