package c5ejercicios.ejercicio2;

/*
    Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre,
    una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones
    utilizando Streams y Optionals:
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Evento> listEventos = Arrays.asList(
                new Evento("Evento 1", LocalDate.parse("15/11/2023", formatter), "Reunión"),
                new Evento("Evento 2", LocalDate.parse("16/11/2023", formatter), "Conferencia"),
                new Evento("Evento 3", LocalDate.parse("18/11/2023", formatter), "Taller"),
                new Evento("Evento 4", LocalDate.parse("17/11/2023", formatter), "Conferencia"),
                new Evento("Evento 5", LocalDate.parse("18/11/2023", formatter), "Reunión"),
                new Evento("Evento 6", LocalDate.parse("15/11/2023", formatter), "Reunión"),
                new Evento("Evento 7", LocalDate.parse("19/11/2023", formatter), "Taller")
        );

        String fechaFiltro = "19/11/2023";

        // - Filtra los eventos que están programados para una fecha específica.
        listEventos.stream()
                .filter(evento -> evento.getFecha().toString().equals(fechaFiltro))
                .forEach(System.out::println);

        // - Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        listEventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoría))
                .entrySet()
                .stream()
                .forEach((key) -> {
                    long count = key.getValue()
                            .stream()
                            .count();

                    System.out.println(key.getKey() + " = " + count);
                });

        // - Encuentra el evento más próximo en el tiempo utilizando Optionals.
        listEventos.stream()
                .reduce((evento, eventoProximo) -> {
                    long dias = DAYS.between(evento.getFecha(), LocalDate.now());
                    long dias2 = DAYS.between(eventoProximo.getFecha(), LocalDate.now());

                    if (dias > dias2)
                        eventoProximo = evento;

                    return eventoProximo;
                })
                .ifPresentOrElse(value -> System.out.println("El evento mas proximo es:\n" + value),
                        () -> System.err.println("Error"));

    }
}
