package c7ejercicios.ejercicio1;

import java.util.List;

public class ExploradorDirectorios {
    // Muestra la esturctura del parametro Directorio y envia las listas a mostrarEstructuraDirectorioLista
    public static void mostrarEstructuraDirectorio(Directorio directorio) {
        if (directorio != null) {
            System.out.println(directorio);
            mostrarEstructuraArchivosLista(directorio.getArchivos(), 0);
            mostrarEstructuraDirectorioLista(directorio.getSubdirectorios(), 0);
        }
    }

    // Muestra la estructura de una lista de Directorios usando indices y el metodo mostrarEstructuraDirectorio()
    private static void mostrarEstructuraDirectorioLista(List<Directorio> menu, int indice) {
        if (menu.size() > 0 && indice < menu.size()) {
            System.out.println("Listas de contenido: ");
            mostrarEstructuraDirectorio(menu.get(indice));
            mostrarEstructuraDirectorioLista(menu, ++indice);
        }
    }

    // Muestra la estructura de una lista de archivos usando indices y el metodo mostrarEstructura()
    private static void mostrarEstructuraArchivosLista(List<String> archivos, int indice) {
        if (archivos.size() > 0 && indice < archivos.size()) {
            System.out.println(archivos.get(indice));
            mostrarEstructuraArchivosLista(archivos, ++indice);
        }
    }
}
