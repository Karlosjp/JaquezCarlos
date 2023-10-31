package c6ejercicios.ej1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Moto extends Vehiculo implements ICombustion {
    private int cilindrada;
    private String tipoMotor;
    private Double capacidadTanque;

    public Moto(int anno, Double costo, String placa, String marca, String modelo, int cilindrada, String tipoMotor, Double capacidadTanque) {
        super(anno, costo, placa, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String recargarCombustible(Double carga) {
        this.capacidadTanque += carga;

        return "La carga de combustible actual es: " + this.capacidadTanque;
    }

    @Override
    public int CalcularAntiguedad() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int i = localDate.getYear() - this.anno;

        return i;
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() + " Capacidad del tanque = " + capacidadTanque + ", Cilindrada = " +
                cilindrada + " Tipo de Motor = " + tipoMotor + '}';
    }
}
