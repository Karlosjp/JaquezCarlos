package c6ejercicios.ej2;

public class Producto {
    private static int cod = 0;
    private int código;
    private int stock;
    private Double precioCosto;
    private Double precioVenta;
    private String nombre;
    private String marca;
    private String tipo;

    public Producto(int stock, Double precioCosto, Double precioVenta, String nombre, String marca, String tipo) {
        this.código = cod++;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto -> código: " + código + ", stock: " + stock + ", precioCosto: " + precioCosto +
                ", precioVenta: " + precioVenta + ", nombre: " + nombre + ", marca: " + marca + ", tipo: " + tipo;
    }
}
