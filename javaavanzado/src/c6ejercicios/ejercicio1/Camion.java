package c6ejercicios.ejercicio1;

public class Camion extends Auto {
    private String nombre;

    public Camion(String marca, String modelo, Integer anno, Double precio, String nombre) {
        super(marca, modelo, anno, precio);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "nombre='" + nombre + '\'' +
                super.toString() +
                '}';
    }
}
