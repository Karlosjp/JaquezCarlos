package c6ejercicios.ej1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Auto extends Vehiculo implements IElectrico {
    private Double capacidadBateriaMah;
    private Double autonomiaHs;

    public Auto(int anno, Double costo, String placa, String marca, String modelo, Double capacidadBateriaMah, Double autonomiaHs) {
        super(anno, costo, placa, marca, modelo);
        this.capacidadBateriaMah = capacidadBateriaMah;
        this.autonomiaHs = autonomiaHs;
    }

    @Override
    public String cargarEnergia(Double carga) {
        this.capacidadBateriaMah += carga;

        return "La energia actual es: " + this.capacidadBateriaMah;
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
        return "Auto{" + super.toString() + " Capacidad de la bateria (En mah) = " + capacidadBateriaMah +
                ", Autonomia (En horas) = " + autonomiaHs + '}';
    }
}
