package c2ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<String> registro;

    public Registro() {
        this.registro = new ArrayList<>();
    }

    public synchronized void registrarInformacion(String informacion) {
        registro.add(informacion);
    }

    public List<String> getRegistro() {
        return registro;
    }
}
