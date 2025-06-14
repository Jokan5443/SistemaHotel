package Interfaz;
import GestionEmpleados.Area;
import GestionEmpleados.RegistroPago;
import java.util.List;

  public interface IGestionRegistros {
    void addRegistro(RegistroPago registro);
    void dropRegistro(int idRegistro);
    void dropRegistro(RegistroPago registro);
    RegistroPago getRegistro(int idRegistro);
    RegistroPago getRegistro(RegistroPago registro);
    void modificarRegistro(int idRegistro, double monto);
    List<Area> getMisAreas();
}