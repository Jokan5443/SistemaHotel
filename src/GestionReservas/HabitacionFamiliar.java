
package GestionReservas;

public class HabitacionFamiliar extends Habitacion {
    public HabitacionFamiliar(int numeroHabitacion) {
        super(numeroHabitacion, 200.0, 6);
    }

    @Override
    public String getTipoHabitacion() {
        return "Familiar";
    }
}