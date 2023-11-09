package c2ejercicios.ejercicio1;

/*
    • Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden atender
      llamadas telefónicas concurrentemente.
    • Cada agente se representa como un hilo independiente.
    • Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada.
      Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan
      manejarlas de manera eficiente.
    • Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.
 */

public class Main {
    public static void main(String[] args) {
        Registro registroLlamadas = new Registro();

        Agente agente1 = new Agente("Agente 1", registroLlamadas);
        Agente agente2 = new Agente("Agente 1", registroLlamadas);
        Agente agente3 = new Agente("Agente 1", registroLlamadas);
        Agente agente4 = new Agente("Agente 1", registroLlamadas);

        Thread hilo1 = new Thread(agente1);
        Thread hilo2 = new Thread(agente2);
        Thread hilo3 = new Thread(agente3);
        Thread hilo4 = new Thread(agente4);

        agente1.recibirLlamada("Mi problema es xxxxx");
        agente2.recibirLlamada("Mi problema es yyyyy");
        agente3.recibirLlamada("Mi problema es eeeee");
        agente4.recibirLlamada("Mi problema es ttttt");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();

            for (String str : registroLlamadas.getRegistro())
                System.out.println(str);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        /*
        agente1.recibirLlamada("Mi problema es uuuuu");
        agente2.recibirLlamada("Mi problema es sssss");
        agente3.recibirLlamada("Mi problema es ppppp");
        agente4.recibirLlamada("Mi problema es tytyty");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
*/
    }
}
