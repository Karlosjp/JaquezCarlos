package c1ejercicios;

/*
    a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario. Por ejemplo: “Hola,
       bienvenido al sistema”.
    b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre
       el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenida al sistema”.
*/

public class ejercicio1 {
    public static void main(String[] args) {
        String msg = "Hola, bienbenido al sistema";
        String name = "Carlos";

        System.out.println(msg);
        System.out.println(msg + " " + name);
    }
}
