package c6ejercicios.ej1;

public abstract class Vehiculo {
    private static int cod = 0;
    protected int id;
    protected int anno;
    protected Double costo;
    protected String placa;
    protected String marca;
    protected String modelo;

    public Vehiculo(int anno, Double costo, String placa, String marca, String modelo) {
        this.id = cod++;
        this.anno = anno;
        this.costo = costo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract int CalcularAntiguedad();

    @Override
    public String toString() {
        return "ID = " + id + ", Año = " + anno + ", Costo = " + costo + ", Placa = " + placa +
                ", Marca = " + marca + ", Modelo = " + modelo;
    }
}
