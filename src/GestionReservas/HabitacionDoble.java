
package GestionReservas;
public class HabitacionDoble extends Habitacion {
     public HabitacionDoble(String numeroHabitacion) {
        super(numeroHabitacion, "Doble", "Habitación doble con capacidad para dos personas.", 150.0, "Disponible");
    }

    @Override
    public String getTipoHabitacion() {
        return "Doble";
    }
}