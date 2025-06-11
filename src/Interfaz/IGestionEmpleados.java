package Interfaz;
import GestionEmpleados.Empleado;

  public interface IGestionEmpleados {
    void addEmpleado(Empleado empleado);
    void dropEmpleado(int edEmpleado);
    void dropEmpleado(Empleado empleado);
}