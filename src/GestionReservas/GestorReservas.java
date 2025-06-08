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

    public Reserva crearReserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        if (!habitacion.getEstado().equalsIgnoreCase("Disponible")) {
            System.out.println("La habitación no está disponible.");
            return null;
        }
        Reserva nuevaReserva = new Reserva(idReservaActual++, cliente, habitacion, fechaEntrada, fechaSalida);
        reservas.add(nuevaReserva);
        habitacion.setEstado("Ocupada");
        return nuevaReserva;
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

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
