package c5ejercicios.ej1;

public class Ave extends Animal {
    private int envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave(int id, int edad, String nombre, String tipoPiel, String tipoAlimentación,
               int envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, edad, nombre, tipoPiel, tipoAlimentación);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    @Override
    public String Saludar() {
        return "Hola, soy un ave";
    }
}
