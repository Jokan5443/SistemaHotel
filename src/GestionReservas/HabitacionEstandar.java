
package GestionReservas;

public class HabitacionEstandar extends Habitacion {
    public HabitacionEstandar(int numeroHabitacion) {
        super(numeroHabitacion, 100.0, 2);
    }

    @Override
    public String getTipoHabitacion() {
        return "Estandar";
    }
}
