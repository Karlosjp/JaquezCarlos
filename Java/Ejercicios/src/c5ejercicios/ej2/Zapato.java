package c5ejercicios.ej2;

public class Zapato extends Vestimenta {
    private String material;
    private String tipoCierre;

    public Zapato(Double precio, String talla, String nombre, String marca, String color, String material, String tipoCierre) {
        super(precio, talla, nombre, marca, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String getInfor() {
        return "Estos zapatos son" + super.getInfor();
    }
}
