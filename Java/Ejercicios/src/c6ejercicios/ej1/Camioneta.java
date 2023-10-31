package c6ejercicios.ej1;

import java.time.LocalDate;
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
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int i = localDate.getYear() - this.anno;

        return i;
    }

    @Override
    public String recargarCombustible(Double carga) {
        this.capacidadTanque += carga;

        return "La carga de combustible actual es: " + this.capacidadTanque;
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() + " Capacidad del tanque = " + capacidadTanque + ", Consumo de combustible = "
                + consumoCombustible + '}';
    }
}
