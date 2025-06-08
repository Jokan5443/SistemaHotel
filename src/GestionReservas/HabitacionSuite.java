package GestionReservas;

public class HabitacionSuite extends Habitacion {

    public HabitacionSuite(String numeroHabitacion) {
        super(numeroHabitacion, "Suite", "Suite de lujo con sala de estar, jacuzzi y vista panorámica.", 300.0, "Disponible");
    }

    @Override
    public String getTipoHabitacion() {
        return "Suite";
    }
}
