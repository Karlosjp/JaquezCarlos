package c5ejercicios.ej1;

public abstract class Animal {
    private int id;
    private int edad;
    private String nombre;
    private String tipoPiel;
    private String tipoAlimentación;

    public Animal(int id, int edad, String nombre, String tipoPiel, String tipoAlimentación) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentación = tipoAlimentación;
    }

    public String Saludar() {
        return "Hola, soy un animal";
    }
    /*
    private String Saludar() {
        return "Hola, soy un animal";
    }
    protected abstract String Saludar();
    */
}
