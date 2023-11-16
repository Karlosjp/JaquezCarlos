package c7ejercicios.ejercicio1;

public class Datos {
    // Directorio raiz
    public static Directorio rootDirectorio = new Directorio("Directorio raiz");

    public static void agregarDatos() {
        String nameArchivo = "Archivo nº ";
        String nameSubDirectorio = "Sub Directorio";

        rootDirectorio.agregarDirectorio(new Directorio(nameSubDirectorio + "0")); // Rama directorio 0
        // Rama Subdirectorio 0
        rootDirectorio.getSubdirectorios().get(0).agregarDirectorio(new Directorio(nameSubDirectorio + "1"));
        rootDirectorio.getSubdirectorios().get(0).agregarDirectorio(new Directorio(nameSubDirectorio + "2"));
        rootDirectorio.getSubdirectorios().get(0).agregarArchivo(nameArchivo + "1");
        rootDirectorio.getSubdirectorios().get(0).agregarArchivo(nameArchivo + "2");

        // Rama Subdirectorio 0 - Sub rama 0
        rootDirectorio.getSubdirectorios().get(0).getSubdirectorios().get(0).agregarArchivo(nameArchivo + "1");
        rootDirectorio.getSubdirectorios().get(0).getSubdirectorios().get(0).agregarArchivo(nameArchivo + "2");
        rootDirectorio.getSubdirectorios().get(0).getSubdirectorios().get(0).agregarArchivo(nameArchivo + "3");

        // Rama Subdirectorio 0 - Sub rama 1
        rootDirectorio.getSubdirectorios().get(0).getSubdirectorios().get(1).agregarArchivo(nameArchivo + "1");

        rootDirectorio.agregarDirectorio(new Directorio(nameSubDirectorio + "1")); // Rama directorio 1
        // Rama Subdirectorio 1
        rootDirectorio.getSubdirectorios().get(1).agregarDirectorio(new Directorio(nameSubDirectorio + "1"));
        rootDirectorio.getSubdirectorios().get(1).agregarDirectorio(new Directorio(nameSubDirectorio + "2"));
        rootDirectorio.getSubdirectorios().get(1).agregarDirectorio(new Directorio(nameSubDirectorio + "3"));
        rootDirectorio.getSubdirectorios().get(1).agregarArchivo(nameArchivo + "1");
    }
}
