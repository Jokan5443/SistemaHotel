package Interfaz;

import GestionEmpleados.Empleado;
import GestionEmpleados.RegistroPago;
import java.time.LocalDateTime;

public interface IAccionesGerente {
    void aprobarPago(RegistroPago pago);
    void aprobarDespido(Empleado empleado);
    void asensoOperario(Empleado operario);
    void asensoSupervisor(Empleado supervisor);
    void asensoJefe(Empleado jefe);
    void renovarContrato(Empleado empleado,
                        LocalDateTime nuevaTermino,
                        LocalDateTime nuevaRenovacion);
}
