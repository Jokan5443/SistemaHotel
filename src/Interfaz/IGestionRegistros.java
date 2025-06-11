package Interfaz;
import GestionEmpleados.RegistroPago;

  public interface IGestionRegistros {
    void addRegistro(RegistroPago registro);
    void dropRegistro(int idRegistro);
    void dropRegistro(RegistroPago registro);
}