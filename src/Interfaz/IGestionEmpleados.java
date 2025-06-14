package Interfaz;
import GestionEmpleados.Empleado;
import GestionEmpleados.Enum.TipoContrato;
import java.util.List;

  public interface IGestionEmpleados {
    void addEmpleado(Empleado area);
    void dropEmpleado(int idEmpleado);
    void dropEmpleado(Empleado area);
    Empleado getEmpleado(int idEmpleado);
    Empleado getEmpleado(Empleado empleado);
    void modificarEmpleado(int idEmpleado, String nombre, String apellido, String email,
                                  String dni, TipoContrato tipoContrato, int idArea, double tarifaHora);
    List<Empleado> getMisEmpleados();
}