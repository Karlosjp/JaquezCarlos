package c5ejercicios.ej2;

public class Camiseta extends Vestimenta {
    private String manga;
    private String cuello;

    public Camiseta(Double precio, String talla, String nombre, String marca, String color, String manga, String cuello) {
        super(precio, talla, nombre, marca, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    @Override
    public String getInfor() {
        return "Esta camiseta es" + super.getInfor();
    }
}
