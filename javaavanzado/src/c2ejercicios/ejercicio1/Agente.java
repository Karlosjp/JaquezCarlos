package c2ejercicios.ejercicio1;

public class Agente implements Runnable {
    private String nombre;
    private String informacion;
    private Registro registro;

    public Agente(String nombre, Registro registro) {
        this.nombre = nombre;
        this.registro = registro;
        informacion = "";
    }

    public void recibirLlamada(String informacion) {
        this.informacion = informacion;
        resolverConsulta();
    }

    private void resolverConsulta() {
        this.informacion = "El estado de la consulta: " + this.informacion + " es RESUELTO.";
    }

    @Override
    public void run() {
        registro.registrarInformacion("El agente: " + this.nombre + " ha atendido la consulta. " + this.informacion);
    }
}
