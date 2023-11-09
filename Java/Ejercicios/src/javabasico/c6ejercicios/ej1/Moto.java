package c6ejercicios.ej1;

import java.time.LocalDate;
import java.time.Period;

public class Moto extends Vehiculo implements ICombustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(int anno, Double costo, String placa, String marca, String modelo, int cilindrada, String tipoMotor) {
        super(anno, costo, placa, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String recargarCombustible() {
        return "Recargando combustible";
    }

    @Override
    public int CalcularAntiguedad() {
        LocalDate fechaFabricacion = LocalDate.of(anno, 1, 1);
        LocalDate fechaActual = LocalDate.now();

        return Period.between(fechaFabricacion, fechaActual).getYears();
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() + ", Cilindrada = " + cilindrada + " Tipo de Motor = " + tipoMotor + '}';
    }
}
