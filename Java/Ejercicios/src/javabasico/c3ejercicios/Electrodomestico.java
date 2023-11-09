package c3ejercicios;

public class Electrodomestico {
    private int cod;
    private String marca;
    private String modelo;
    private String consumo;
    private String color;

    public String getMarca() {
        return marca;
    }

    public Electrodomestico() {
        this.cod = 0;
        this.marca = "No especificado";
        this.modelo = "No especificado";
        this.consumo = "No especificado";
        this.color = "No especificado";
    }

    public Electrodomestico(int cod, String marca, String modelo, String consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " Modelo: " + modelo + " Consumo: " + consumo;
    }
}
