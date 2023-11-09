package c1ejercicios.ejercicio1;

public class Vuelo {
    private int asientosReservados;
    private int asientosTotales;

    public Vuelo(int asientosTotales) {
        this.asientosTotales = asientosTotales;
        this.asientosReservados = 0;
    }

    public boolean reservarAsientos(int cantidad) throws ReservaInvalidaException {
        if ((asientosReservados + cantidad) > asientosTotales)
            throw new ReservaInvalidaException("El numero de asientos disponibles no es suficiente");
        else asientosReservados += cantidad;

        return true;
    }
}
