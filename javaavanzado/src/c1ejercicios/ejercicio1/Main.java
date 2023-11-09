package c1ejercicios.ejercicio1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean repetir = true;
        List<Usuario> users = new ArrayList<>();
        Vuelo vuelo = new Vuelo(50);

        do {
            try {
                System.out.print("Bienvenido al programa. \nPara hacer reserva introduce '1': ");
                String entrada = introducirDatosString();

                if ("1".equals(entrada)) {
                    System.out.println("Introduce los datos para la reserva");

                    System.out.print("Nombre: ");
                    String nombre = introducirDatosString();

                    System.out.print("Destino: ");
                    String destino = introducirDatosString();

                    System.out.println("Fecha de vuelo: ");
                    Date fechaViaje = introducirDatosDate();

                    System.out.print("Asientos deseados: ");
                    int asientos = introducirDatosInteger();

                    if (vuelo.reservarAsientos(asientos)) {
                        users.add(new Usuario(nombre, destino, fechaViaje, asientos));

                        System.out.println("La reserva ha sido realizada");
                    }
                } else repetir = false;
            } catch (ReservaInvalidaException e) {
                System.err.println(e.getMessage());
            }

        } while (repetir);

        System.out.println("El programa se ha cerrado");
    }

    public static String introducirDatosString() throws ReservaInvalidaException {

        String entrada = sc.nextLine();

        if (!entrada.isEmpty() && !(entrada == null)) return entrada;
        else throw new ReservaInvalidaException("El dato introducido es incorrecto");
    }

    public static Integer introducirDatosInteger() throws ReservaInvalidaException {
        try {
            String entrada = sc.nextLine();

            if (!entrada.isEmpty() && !(entrada == null)) {
                int num = Integer.parseInt(entrada);

                return num;
            } else throw new ReservaInvalidaException("El dato introducido es incorrecto");
        } catch (NumberFormatException nfe) {
            throw new ReservaInvalidaException("El numero introducido es incorrecto.");
        }
    }

    public static Date introducirDatosDate() throws ReservaInvalidaException {
        System.out.print("Año del viaje: ");
        int anno = introducirDatosInteger();

        System.out.print("Mes del viaje: ");
        int mes = introducirDatosInteger();

        System.out.print("Dia del viaje: ");
        int dia = introducirDatosInteger();

        return stringToDate(dia + "/" + mes + "/" + anno);
    }

    public static Date stringToDate(String d) throws ReservaInvalidaException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        try {
            return df.parse(d);
        } catch (ParseException e) {
            throw new ReservaInvalidaException("La fecha es incorrecta");
        }
    }
}