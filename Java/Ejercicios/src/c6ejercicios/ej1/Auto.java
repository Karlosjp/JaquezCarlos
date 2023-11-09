package c6ejercicios.ej1;

import java.time.LocalDate;
import java.time.Period;

public class Auto extends Vehiculo implements IElectrico {
    private Double capacidadBateriaMah;
    private Double autonomiaHs;

    public Auto(int anno, Double costo, String placa, String marca, String modelo, Double capacidadBateriaMah, Double autonomiaHs) {
        super(anno, costo, placa, marca, modelo);
        this.capacidadBateriaMah = capacidadBateriaMah;
        this.autonomiaHs = autonomiaHs;
    }

    @Override
    public String cargarEnergia() {
        return "Recargando energia";
    }

    @Override
    public int CalcularAntiguedad() {
        LocalDate fechaFabricacion = LocalDate.of(anno, 1, 1);
        LocalDate fechaActual = LocalDate.now();

        return Period.between(fechaFabricacion, fechaActual).getYears();
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() + " Capacidad de la bateria (En mah) = " + capacidadBateriaMah +
                ", Autonomia (En horas) = " + autonomiaHs + '}';
    }
}
