
package GestionReservas;

public class HabitacionSuite extends Habitacion {
    public HabitacionSuite(int numeroHabitacion) {
        super(numeroHabitacion, 300.0, 2);
    }

    @Override
    public String getTipoHabitacion() {
        return "Suite";
    }
}
