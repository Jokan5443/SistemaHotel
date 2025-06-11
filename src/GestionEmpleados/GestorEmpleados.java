package GestionEmpleados;

import GestionEmpleados.Enum.TipoContrato;
import Interfaz.*;
import java.util.List;

public class GestorEmpleados implements IGestionEmpleados, IGestionAreas, IGestionRegistros{
    //Lista de empleados, areas y registros
    private List<Empleado> misEmpleados;
    private List<Area> misAreas;
    private List<RegistroPago> misRegistros;
    
    //Añadir elementos a las listas
    @Override
    public void addEmpleado(Empleado e){
        misEmpleados.add(e);
    }    
    
    @Override
    public void addArea(Area a){
        misAreas.add(a);
    }   
   
    @Override
    public void addRegistro(RegistroPago rp){
        misRegistros.add(rp);
    }
    
    // Elimina un supervisor a cargo por su identificador.
    @Override
    public void dropEmpleado(int idEmpleado) {
        if(!misEmpleados.isEmpty()){
            for(Empleado e: misEmpleados){
                if(e.getId() == idEmpleado){
                    misEmpleados.remove(e);
                }
            }
        }
    }

    // Elimina un supervisor a cargo por su objeto.
    @Override
    public void dropEmpleado(Empleado empleado) {
        if (empleado != null) {
            misEmpleados.remove(empleado);
        }
    }
    
    // Elimina un Area por su identificador.
    @Override
    public void dropArea(int idArea) {
        if(!misAreas.isEmpty()){
            for(Area a: misAreas){
                if(a.getIdArea() == idArea){
                    misAreas.remove(a);
                }
            }
        }
    }

    // Elimina un Area por su objeto.
    @Override
    public void dropArea(Area area) {
        if (area != null) {
            misAreas.remove(area);
        }
    }
    
    // Elimina un Registro por su identificador.
    @Override
    public void dropRegistro(int idRegistro) {
        if(!misRegistros.isEmpty()){
            for(RegistroPago rg: misRegistros){
                if(rg.getIdPago() == idRegistro){
                    misRegistros.remove(rg);
                }
            }
        }
    }

    // Elimina un Registro por su objeto.
    @Override
    public void dropRegistro(RegistroPago registro) {
        if (registro != null) {
            misRegistros.remove(registro);
        }
    }
    
    //Buscador de empleado por su id
    public Empleado getEmpleado(int idEmpleado){
        Empleado empleado = null;
        
        if(!misEmpleados.isEmpty()){
            for(Empleado e: misEmpleados){
                if(e.getId() == idEmpleado){
                    empleado = e;
                    return empleado;
                }
            }
        }
        
        return empleado;
    }
    
    //Buscador de area por su id
    public Area getArea(int idArea){
        Area area = null;
        
        if(!misAreas.isEmpty()){
            for(Area a: misAreas){
                if(a.getIdArea() == idArea){
                    area = a;
                    return area;
                }
            }
        }
        
        return area;
    }

    //Buscador de registro por su id
    public RegistroPago getRegistro(int idRegistro){
        RegistroPago registro = null;
        
        if(!misRegistros.isEmpty()){
            for(RegistroPago rp: misRegistros){
                if(rp.getIdPago() == idRegistro){
                    registro = rp;
                    return registro;
                }
            }
        }
        
        return registro;
    }
    
    //Modificar datos de empleado
    public void modificarEmpleado(int idEmpleado, String nombre, String apellido, String email,
                                  String dni, TipoContrato tipoContrato, int idArea, double tarifaHora){
        
        if(!misEmpleados.isEmpty()){
            for(Empleado e: misEmpleados){
                if(e.getId() == idEmpleado){
                    e.setNombre(nombre);
                    e.setApellido(apellido);
                    e.setEmail(email);
                    e.setDni(dni);
                    e.setTipoContrato(tipoContrato);
                    e.setAreaLabor(idArea);
                    e.setTarifaPorHora(tarifaHora);
                }
            }
        }
    }
    
    //Modificar valores de Area
    public void modificarArea(int idArea, String nombre){
        
        if(!misAreas.isEmpty()){
            for(Area a: misAreas){
                if(a.getIdArea() == idArea){
                    a.setNombre(nombre);
                }
            }
        }
        
    }
    
    //Modificar valores Registro
    public void modificarRegistro(int idRegistro, double monto){
        if(!misRegistros.isEmpty()){
            for(RegistroPago rp: misRegistros){
                if(rp.getIdPago() == idRegistro){
                    rp.setMonto(monto);
                }
            }
        }
    }
    
    // Obtiene la listas (solo lectura), evitando enlazar las listas.
    public List<Empleado> getMisEmpleados() { return List.copyOf(misEmpleados); }
    public List<Area> getMisAreas() { return List.copyOf(misAreas); }
    public List<RegistroPago> getMisRagistro() { return List.copyOf(misRegistros); }
}
