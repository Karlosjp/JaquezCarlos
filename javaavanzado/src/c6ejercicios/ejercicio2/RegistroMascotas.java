package c6ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegistroMascotas<T extends Mascota> {
    List<T> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<T>();
    }

    public void agregarMascota(T m) {
        registro.add(m);
    }

    public List<T> buscarMascotaEspecie(String nombre) {
        return registro.stream()
                .filter(m -> m.getEspecie().equalsIgnoreCase(nombre))
                .toList();
    }

    public List<T> buscarMascotaNombre(String nombre) {
        return registro.stream()
                .filter(m -> m.getNombre().equalsIgnoreCase(nombre))
                .toList();
    }

    public Integer cantidadTotalRegistro() {
        return registro.size();
    }
}
