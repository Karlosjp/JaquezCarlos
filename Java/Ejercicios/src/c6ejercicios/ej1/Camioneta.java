package c6ejercicios.ej1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Camioneta extends Vehiculo implements ICombustion {
    private Double capacidadTanque;
    private Double consumoCombustible;

    public Camioneta( int anno, Double costo, String placa, String marca, String modelo, Double capacidadTanque, Double consumoCombustible) {
        super(anno, costo, placa, marca, modelo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int CalcularAntiguedad() {
        LocalDate fechaFabricacion = LocalDate.of(anno, 1, 1);
        LocalDate fechaActual = LocalDate.now();

        return Period.between(fechaFabricacion, fechaActual).getYears();
    }

    @Override
    public String recargarCombustible() {
        return "Recargando combustible";
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() + " Capacidad del tanque = " + capacidadTanque + ", Consumo de combustible = "
                + consumoCombustible + '}';
    }
}
