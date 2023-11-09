package c1ejercicios.ejercicio1;

import java.util.Date;

public class Usuario {
    private String nombre;
    private String destino;
    private Date fechaVuelo;
    private Integer asientosDeseados;

    public Usuario(String nombre, String destino, Date fechaVuelo, Integer asientosDeseados) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.asientosDeseados = asientosDeseados;
    }

    public Integer getAsientosDeseados() {
        return asientosDeseados;
    }
}
