package c6ejercicios.ejercicio2;

/*
    Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la
    definición de una clase genérica Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id
    de mascota para identificar a cada una). Crea una clase utilitaria propia llamada RegistroMascotas que cuente con
    métodos genéricos para:
    1 - Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular
    colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria
    (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
    2 - Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto
    con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
    3 - Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util para obtener el tamaño de la
    colección y contar la cantidad total de mascotas registradas en la veterinaria.
    4 - Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util para generar datos aleatorios,
    como nombres, edades o especies, para agregar mascotas al registro.
 */

public class Main {
    public static void main(String[] args) {
        RegistroMascotas<Ave> registroAve = new RegistroMascotas();
        RegistroMascotas<Gato> registroGato = new RegistroMascotas();
        RegistroMascotas<Perro> registroPerro = new RegistroMascotas();
        RegistroMascotas<Reptil> registroReptil = new RegistroMascotas();

        
    }
}
