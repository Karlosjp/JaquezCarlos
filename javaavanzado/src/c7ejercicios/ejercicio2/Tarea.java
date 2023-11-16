package c7ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private static long id = 0;
    private String numero;
    private String nombre;
    private List<Tarea> tareasAsociadas;

    public Tarea(String nombre) {
        this.numero = "" + id;
        this.nombre = nombre;
        this.tareasAsociadas = new ArrayList<>();
        id++;
    }

    public void agregarTareaAsociada(Tarea nTarea) {
        nTarea.setNumero(this.numero + " - " + nTarea.getNumero());
        tareasAsociadas.add(nTarea);
    }

    public String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareasAsociadas() {
        return tareasAsociadas;
    }

    public void setTareasAsociadas(List<Tarea> tareasAsociadas) {
        this.tareasAsociadas = tareasAsociadas;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "numero ='" + numero + '\'' +
                ", nombre ='" + nombre + '\'' +
                ", tareasAsociadas =" + tareasAsociadas.size() +
                '}';
    }
}
