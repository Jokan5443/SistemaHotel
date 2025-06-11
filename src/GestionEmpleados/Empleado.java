package GestionEmpleados;

import GestionEmpleados.Enum.*;
import Interfaz.IAsistenciaSemanal;
import Interfaz.IRegistrarHorasDiarias;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Empleado extends Entidad 
    implements IRegistrarHorasDiarias, IAsistenciaSemanal {

    // Salario base o calculado
    protected double salario;
    
    // Fecha y hora de término de contrato
    protected LocalDateTime fechaTermino;

    // Fecha y hora de próxima renovación 
    protected LocalDateTime fechaRenovacion;

    // Estado actual del empleado
    protected EstadoEmpleado estadoLaboral;
    
    // Tipo de contrato laboral
    protected TipoContrato tipoContrato;
    
    // Área o departamento del empleado
    protected int idArea;

    // Tarifa por hora para cálculo de salario
    protected double tarifaPorHora;

    // Horas trabajadas cada día de la semana
    protected final List<Integer> horasTrabajadasPorDia = new ArrayList<>();

    // Mapa de asistencia: fecha -> presente (true) o falta (false)
    protected final Map<LocalDateTime, Boolean> listaAsistencias = new HashMap<>();

    // Constructor completo.
    public Empleado(int idArea,
                    double tarifaPorHora,
                    int id,
                    String nombre,
                    String apellido,
                    String email,
                    String dni,
                    LocalDateTime fechaIngreso,
                    LocalDateTime fechaTermino,
                    LocalDateTime fechaRenovacion,
                    TipoContrato tipoContrato) {
        super(id, nombre, apellido, email, dni, fechaIngreso);
        this.fechaTermino = fechaTermino;
        this.fechaRenovacion = fechaRenovacion;
        this.tipoContrato = tipoContrato;
        this.estadoLaboral = EstadoEmpleado.ACTIVO;
        this.idArea = idArea;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Constructor alternativo sin fechaIngreso explícita (se toma el momento actual).
    public Empleado(int idArea,
                    double tarifaPorHora,
                    int id,
                    String nombre,
                    String apellido,
                    String email,
                    String dni,
                    LocalDateTime fechaTermino,
                    LocalDateTime fechaRenovacion,
                    TipoContrato tipoContrato) {
        super(id, nombre, apellido, email, dni);
        this.fechaTermino = fechaTermino;
        this.fechaRenovacion = fechaRenovacion;
        this.tipoContrato = tipoContrato;
        this.estadoLaboral = EstadoEmpleado.ACTIVO;
        this.idArea = idArea;
        this.tarifaPorHora = tarifaPorHora;
    }

    //Marca al empleado como despedido y actualiza la fecha de término.
    public void registrarDespido() {
        this.estadoLaboral = EstadoEmpleado.DESPEDIDO;
        this.fechaTermino = LocalDateTime.now();
    }
    
    // Representación en texto de la entidad con formato legible.
    @Override
    public String toString() {
        return String.format(
            "ID: %d | %s %s | Email: %s | DNI: %s | Ingreso: %s | Término: %s | Salario: %.2f | Contrato: %s | Estado: %s",
            id,
            nombre,
            apellido,
            email,
            dni,
            fechaIngreso.format(FORMATO_FECHA),
            fechaTermino.format(FORMATO_FECHA),
            salario,
            tipoContrato,
            estadoLaboral
        );
    }
    
    // Todavia no se implementa el metodo.
    @Override
    public abstract double calcularSalario();

    // Registra las horas trabajadas en un día calculando la diferencia entre ingreso y salida.
    @Override
    public void registrarHorasDiarias(LocalDateTime horaIngreso, LocalDateTime horaSalida) {
        long horas = Duration.between(horaIngreso, horaSalida).toHours();
        horasTrabajadasPorDia.add((int) horas);
    }

    // Registra la asistencia en una fecha, evitando sobrescrituras.
    @Override
    public void registrarAsistencia(LocalDateTime fecha, boolean presente) {
        listaAsistencias.putIfAbsent(fecha, presente);
    }

    // Cuenta cuántas faltas (valores false) hay en la semana.
    @Override
    public int obtenerFaltasSemana() {
        int faltas = 0;

        for(Boolean asistio : listaAsistencias.values()){
            if (!asistio)
                faltas ++;
        }

        return faltas;
    }

    // Getters y setters

    public int getAreaLabor() {
        return idArea;
    }

    public void setAreaLabor(int idArea) {
        this.idArea = idArea;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    // Obtiene las horas trabajadas por día (solo lectura), evitando enlazar las listas.
    public List<Integer> getHorasTrabajadasPorDia() {
        return List.copyOf(horasTrabajadasPorDia);
    }

    // Obtiene el registro de asistencias (solo lectura), evitando enlazar las listas.
    public Map<LocalDateTime, Boolean> getListaAsistencias() {
        return Map.copyOf(listaAsistencias);
    }
    
    
    
    public LocalDateTime getFechaTermino() { return fechaTermino; }
    public void setFechaTermino(LocalDateTime fechaTermino) { this.fechaTermino = fechaTermino;}

    public double getSalario() { return salario; }

    public LocalDateTime getFechaRenovacion() { return fechaRenovacion; }
    public void setFechaRenovacion(LocalDateTime fechaRenovacion) { this.fechaRenovacion = fechaRenovacion; }

    public EstadoEmpleado getEstadoLaboral() { return estadoLaboral; }
    public void setEstadoLaboral(EstadoEmpleado estadoLaboral) { this.estadoLaboral = estadoLaboral; }
    

    public TipoContrato getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(TipoContrato tipoContrato) { this.tipoContrato = tipoContrato; }

}