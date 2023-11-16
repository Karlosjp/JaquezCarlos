package c7ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    // Clona el objeto
    public Directorio(Directorio d) {
        this.nombre = d.getNombre();
        this.subdirectorios = d.getSubdirectorios();
        this.archivos = d.getArchivos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    public void agregarDirectorio(Directorio m) {
        subdirectorios.add(m);
    }

    public void agregarDirectorios(List<Directorio> menus) {
        this.subdirectorios.addAll(menus);
    }

    public void agregarArchivo(String archivo) {
        archivos.add(archivo);
    }

    public void agregarArchivos(List<String> archivos) {
        this.archivos.addAll(archivos);
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "nombre='" + nombre + '\'' +
                ", subdirectorios=" + subdirectorios.size() +
                ", archivos=" + archivos.size() +
                '}';
    }
}
