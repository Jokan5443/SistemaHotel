
package GestionReservas;
public class HabitacionDoble extends Habitacion {
    public HabitacionDoble(int numeroHabitacion) {
        super(numeroHabitacion, 150.0, 4);
    }

    @Override
    public String getTipoHabitacion() {
        return "Doble";
    }
}