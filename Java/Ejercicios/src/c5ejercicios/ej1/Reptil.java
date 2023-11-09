package c5ejercicios.ej1;

public class Reptil extends Animal {
    private Double longitud;
    private String tipoVeneno;
    private String habitat;

    public Reptil(int id, int edad, String nombre, String tipoPiel, String tipoAlimentación,
                  Double longitud, String tipoVeneno, String habitat) {
        super(id, edad, nombre, tipoPiel, tipoAlimentación);
        this.longitud = longitud;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    @Override
    public String Saludar(){
        return "Hola, soy un reptil";
    }
}
