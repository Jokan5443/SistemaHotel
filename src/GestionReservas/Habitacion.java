package GestionReservas;

public abstract class Habitacion {

    private int idHabitacion; // AUTO_INCREMENT, PRIMARY KEY
    private String numeroHabitacion; // VARCHAR(10), UNIQUE SSSSSSSSSSSSSS
    private String tipo; // VARCHAR(50)sssssssssssssssssss
    private String descripcion; // TEXT
    private double precioPorNoche; // DECIMAL(10,2)SSSSSSSSSSSSSSSSSSSSSSSS
    private String estado; // VARCHAR(50)SSSSSSSSSSSSSSSSSSS

    public Habitacion(int idHabitacion, String numeroHabitacion, String tipo, String descripcion, double precioPorNoche, String estado) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precioPorNoche = precioPorNoche;
        this.estado = estado;
    }
      // Constructor sin ID (para crear nuevas habitaciones desde el código)
    public Habitacion(String numeroHabitacion, String tipo, String descripcion, double precioPorNoche, String estado) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precioPorNoche = precioPorNoche;
        this.estado = estado;
    }
 
    public int getIdHabitacion() {
        return idHabitacion;
    }
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public abstract String getTipoHabitacion();

    @Override
public String toString() {
    return "Habitación " + numeroHabitacion +
           " (" + tipo + "), " +
           "Precio por Noche: $" + String.format("%.2f", precioPorNoche) + ", " +
           "Estado: " + estado;
}

}
