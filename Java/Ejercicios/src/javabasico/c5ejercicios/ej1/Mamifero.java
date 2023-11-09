package c5ejercicios.ej1;

public class Mamifero extends Animal {
    private int numPatas;
    private String tipoRepdoruccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero(int id, int edad, String nombre, String tipoPiel, String tipoAlimentación,
                    int numPatas, String tipoRepdoruccion, String colorPelaje, String habitat) {
        super(id, edad, nombre, tipoPiel, tipoAlimentación);
        this.numPatas = numPatas;
        this.tipoRepdoruccion = tipoRepdoruccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public String Saludar(){
        return "Hola, soy un mamífero";
    }
}
