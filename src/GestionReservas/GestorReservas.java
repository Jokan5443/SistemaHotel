
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
        if (!habitacion.isDisponible()) {
            System.out.println("La habitación no está disponible.");
            return null;
        }
        Reserva nuevaReserva = new Reserva(idReservaActual++, cliente, habitacion, fechaEntrada, fechaSalida);
        reservas.add(nuevaReserva);
        habitacion.setDisponible(false);
        return nuevaReserva;
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

    public boolean cancelarReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                reserva.getHabitacion().setDisponible(true);
                reservas.remove(reserva);
                return true;
            }
        }
        return false;
    }
}