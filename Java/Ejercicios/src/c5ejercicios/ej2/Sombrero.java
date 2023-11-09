package c5ejercicios.ej2;

public class Sombrero extends Vestimenta {
    private String tipo;
    private Double tamaño;

    public Sombrero(Double precio, String talla, String nombre, String marca, String color, String tipo, Double tamaño) {
        super(precio, talla, nombre, marca, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    @Override
    public String getInfor() {
        return "Este sombrero es" + super.getInfor();
    }
}
