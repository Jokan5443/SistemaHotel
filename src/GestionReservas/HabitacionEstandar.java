package GestionReservas;

public class HabitacionEstandar extends Habitacion {

    public HabitacionEstandar(String numeroHabitacion) {
        super(numeroHabitacion, "Estandar", "Habitación estándar con comodidades básicas para una o dos personas.", 100.0, "Disponible");
    }

    @Override
    public String getTipoHabitacion() {
        return "Estandar";
    }
}
