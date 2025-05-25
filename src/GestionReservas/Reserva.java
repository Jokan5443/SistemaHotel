
package GestionReservas;
import java.time.LocalDate;

public class Reserva {
    private int idReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double total;

    public Reserva(int idReserva, Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        return dias * habitacion.getPrecioPorNoche();
    }

    public int getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Reserva " + idReserva + ": " + cliente + ", Habitación: " + habitacion + ", Fecha Entrada: " + fechaEntrada + ", Fecha Salida: " + fechaSalida + ", Total: " + total;
    }
}
