package c3ejercicios;

public class Persona {
    private static int totalId = 0;
    private int edad;
    private String nombre;
    private String direccion;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad, String nombre, String direccion, String telefono) {
        int id = totalId++;
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Direccion: " + direccion + ", Telefono: " + telefono + ",";
    }
}
