package c6ejercicios.ejercicio1;

public class Auto {
    protected String marca;
    protected String modelo;
    protected Integer anno;
    protected Double precio;

    protected Auto(String marca, String modelo, Integer anno, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + anno +
                ", precio=" + precio;
    }
}
