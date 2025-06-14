package Interfaz;
import GestionEmpleados.Area;
import GestionEmpleados.RegistroPago;
import java.util.List;

  public interface IGestionAreas {
    void addArea(Area area);
    void dropArea(int idArea);
    void dropArea(Area area);
    Area getArea(int idArea);
    Area getArea(Area area);
    void modificarArea(int idArea, String nombre);
    List<RegistroPago> getMisRagistro();
}