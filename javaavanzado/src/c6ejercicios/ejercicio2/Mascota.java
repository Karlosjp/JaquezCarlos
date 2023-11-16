package c6ejercicios.ejercicio2;

public class Mascota {
    private static int idAutoincrement = 0;
    private String especie;
    private String nombre;
    private int edad;
    private int codigo;

    public Mascota(String especie, String nombre, int edad) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = idAutoincrement++;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
