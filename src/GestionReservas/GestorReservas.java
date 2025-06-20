package GestionReservas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> reservas;
    private int idReservaActual;

    public GestorReservas() {
        this.reservas = new ArrayList<>();
        this.idReservaActual = 1;
    }

    public Reserva crearReserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida,Double precio, String Observacion) {
        if (!habitacion.getEstado().equalsIgnoreCase("Disponible")) {
            System.out.println("La habitación no está disponible.");
            return null;
        }
        Reserva nuevaReserva = new Reserva(idReservaActual++, cliente, habitacion, fechaEntrada, fechaSalida,precio,Observacion  );
        reservas.add(nuevaReserva);
        habitacion.setEstado("Ocupada");
        return nuevaReserva;
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
// METODO PARA LAS SALIDAS
    public boolean cancelarReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                reserva.getHabitacion().setEstado("Disponible");
                reservas.remove(reserva);
                return true;
            }
        }
        return false;
    }
}
