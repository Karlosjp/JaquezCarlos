package c5ejercicios.ej2;

public class Pantalon extends Vestimenta {
    private String estilo;
    private String tipoTejido;

    public Pantalon(Double precio, String talla, String nombre, String marca, String color, String estilo, String tipoTejido) {
        super(precio, talla, nombre, marca, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    @Override
    public String getInfor() {
        return "Estos pantalones son" + super.getInfor();
    }
}
