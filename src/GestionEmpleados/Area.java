package GestionEmpleados;

import Interfaz.IGestionEmpleados;
import java.util.ArrayList;
import java.util.List;

public class Area implements IGestionEmpleados {

    // Identificador único del área
    private final int idArea;

    // Nombre descriptivo del área
    private String nombre;

    // Lista de IDs de empleados asignados al área
    private final List<Integer> listaEmpleadoIds;

    // Constructor principal.
    public Area(int idArea, String nombre, List<Integer> listaEmpleadoIds) {
        this.idArea = idArea;
        this.nombre = nombre;
        this.listaEmpleadoIds = new ArrayList<>();
    }
    
    // Cuenta cuántos empleados tiene asignados el área.
    public int contarEmpleados() {
        return listaEmpleadoIds.size();
    }
    
    // Agrega un empleado al área.
    @Override
    public void addEmpleado(Empleado empleado) {
        listaEmpleadoIds.add(empleado.getId());
    }

    // Elimina un empleado del área por su identificador.
    @Override
    public void dropEmpleado(int idEmpleado) {
        listaEmpleadoIds.remove(idEmpleado);
    }

    // Elimina un empleado del área por su objeto.
    @Override
    public void dropEmpleado(Empleado empleado) {
        if (empleado != null)
            dropEmpleado(empleado.getId());
    }

    // Obtiene la lista de IDs de empleados asignados (solo lectura), evitando enlazar las listas.
    public List<Integer> getListaEmpleadoIds() {
        return List.copyOf(listaEmpleadoIds);
    }

    // Obtiene el identificador del área.
    public int getIdArea() {
        return idArea;
    }

    // Obtiene el nombre descriptivo del área.
    public String getNombre() {
        return nombre;
    }

    // Establece un nuevo nombre para el área.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


