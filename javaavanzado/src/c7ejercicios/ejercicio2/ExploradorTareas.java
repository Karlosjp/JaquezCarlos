package c7ejercicios.ejercicio2;

import java.util.List;

public class ExploradorTareas {
    // Muestra la esturctura del parametro Tarea y envia las listas a mostrarEstructuraSubTareaLista
    public static void mostrarEstructuraTarea(Tarea tarea) {
        if (tarea != null) {
            System.out.println(tarea);
            System.out.println("Listas de contenido: ");
            mostrarEstructuraSubTareaLista(tarea.getTareasAsociadas(), 0);
        }
    }

    // Muestra la estructura de una lista de Tareas usando indices y el metodo mostrarEstructuraTarea()
    public static void mostrarEstructuraSubTareaLista(List<Tarea> subTareas, int indice) {
        if (subTareas.size() > 0 && indice < subTareas.size()) {
            mostrarEstructuraTarea(subTareas.get(indice));
            mostrarEstructuraSubTareaLista(subTareas, ++indice);
        }
    }

    public static Tarea buscarTarea(List<Tarea> listaTareas, String id, int indice) {
        if (listaTareas != null) {
            List<Tarea> encontrada = listaTareas.stream()
                    .filter(t -> t.getNumero().equals(id))
                    .toList();

            if (encontrada.isEmpty())
                return buscarTarea(listaTareas.get(indice).getTareasAsociadas(), id, 0);
            else
                return encontrada.get(0);

        }

        return null;
    }
}
