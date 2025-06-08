package GestionReservas;

public class HabitacionFamiliar extends Habitacion {

    public HabitacionFamiliar(String numeroHabitacion) {
        super(numeroHabitacion, "Familiar", "Habitación familiar con múltiples camas, ideal para grupos o familias numerosas.", 200.0, "Disponible");
    }

    @Override
    public String getTipoHabitacion() {
        return "Familiar";
    }
}
