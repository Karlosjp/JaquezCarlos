package c3ejercicios;

/*
    Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener
    en cuenta todos sus atributos, constructores y métodos getters y setters).


*/
public class ejercicio2 {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        // a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        personas[0] = new Persona(10, "Patatita", "Calle del Patatal 2", "+34 91 675 48 01");
        personas[1] = new Persona(20, "Patatin", "Calle del Patatal 58", "+34 91 432 03 77");
        personas[2] = new Persona(31, "Patata", "Calle del Patatal 4", "+34 91 754 08 90");
        personas[3] = new Persona(40, "Pataton", "Calle del Patatal 2", "+34 91 789 56 71");
        personas[4] = new Persona(50, "Patatoncio", "Calle del Patatal 4", "+34 91 542 96 64");

        // b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        for (Persona p : personas)
            System.out.println("Nombre: " + p.getNombre() + " Edad: " + p.getEdad());

        System.out.println("\nNombres Modificados:");
        // c) Cambiar el nombre de dos personas.
        CambiarNombre("Eustaquio", personas[2]);
        CambiarNombre("Ambrosio", personas[3]);

        System.out.println("\nMayores de 30 años:");

        // d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        for (Persona p : personas)
            if (p.getEdad() > 30)
                System.out.println(p);
    }

    public static void CambiarNombre(String nName, Persona p) {
        // Mostrar por pantalla él antes, realizar el cambio y luego mostrar él después de los datos de las dos personas
        // cuyos nombres fueron cambiados
        System.out.println(p);
        p.setNombre(nName);
        System.out.println(p);
    }
}
