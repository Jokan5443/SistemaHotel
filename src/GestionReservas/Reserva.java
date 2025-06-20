
package GestionReservas;
import java.time.LocalDate;

public class Reserva { // DETALLE RESERVACION - TABLA  RESERVA
    private int idReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double precio;
    private String Observacion; // TERMINADO CORRECTAMENTE

    public Reserva(int idReserva, Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida, double precio, String Observacion) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
       this.precio = precio;
        this.Observacion = Observacion;
    }

   /* private double calcularPrecioTotal() {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        return dias * habitacion.getPrecioPorNoche();
    }*/
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
    public double getPrecio() {
        return precio;
    }

      
    
    
    
    
    
    
    
    public String getObservacion() {
        return Observacion;
    }


   
}
