
package GestionReservas;

public abstract class Habitacion {
    private int numeroHabitacion;
    private double precioPorNoche;
    private boolean disponible;
    private int capacidad;

    public Habitacion(int numeroHabitacion, double precioPorNoche, int capacidad) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true;
        this.capacidad = capacidad;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public abstract String getTipoHabitacion();

    @Override
    public String toString() {
        return "Habitación " + numeroHabitacion + " (" + getTipoHabitacion() + "), Capacidad: " + capacidad + ", Precio por Noche: " + precioPorNoche + ", Disponible: " + (disponible ? "Sí" : "No");
    }
}
