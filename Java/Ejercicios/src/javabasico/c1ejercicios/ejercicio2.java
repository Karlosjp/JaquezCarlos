package c1ejercicios;

/*
    a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y
       String. Asigna un valor a cada variable y muestra su contenido en la consola.
    b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un
       double…
    - Justificar el por qué de cada caso. Debatir con otros compañeros.
*/
public class ejercicio2 {
    public static void main(String[] args) {
        int num = 0;
        double dNum = 0.1;
        boolean bool = false;
        String str = "Patata";

        System.out.println("Int: " + num + " Double: " + dNum + " Boolean: " + bool + " String: " + str);

        /*
        num = 5.2;
        dNum = "Patata";
        bool = 5;
        str = false;
         */
        // ¿Qué sucede con el programa? No se puede compilar ni ejecutar.
        // ¿Se produce algún error?  Si, exepciones de tipo incompatible
        // ¿En qué situaciones se genera error y en cuáles no? Se genera errores en las 4 variables que he creado
    }
}
