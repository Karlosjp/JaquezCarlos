package c5ejercicios.ej2;

public class Vestimenta {
    private static int cod = 0;
    private int código;
    private Double precio;
    private String talla;
    private String nombre;
    private String marca;
    private String color;

    public Vestimenta(Double precio, String talla, String nombre, String marca, String color) {
        this.código = cod++;
        this.precio = precio;
        this.talla = talla;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
    }

    public String getInfor() {
        return " de marca: " + this.marca;
    }
}
