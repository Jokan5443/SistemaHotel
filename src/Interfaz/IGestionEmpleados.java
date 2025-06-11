package Interfaz;
import GestionEmpleados.Empleado;

  public interface IGestionEmpleados {
    void addEmpleado(Empleado area);
    void dropEmpleado(int idEmpleado);
    void dropEmpleado(Empleado area);
}