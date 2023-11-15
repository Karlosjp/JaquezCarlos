package c5ejercicios.ejercicio2;

import java.time.LocalDate;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String categoría;

    public Evento(String nombre, LocalDate fecha, String categoría) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoría = categoría;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", categoría='" + categoría + '\'' +
                '}';
    }
}
