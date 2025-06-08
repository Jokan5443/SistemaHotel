package Principal;

import java.time.LocalDate;
import GestionReservas.*;

public class Main {

    public static void main(String[] args) {

        /* modulo empleados 3  ---- mpdulo gestion de reserva 
            
            BASES DE DATOS PLANEADAS:
- Gestion de empleados.
- Gestion de reservas
- Usuarios (Inicio de sesión)
            
         */
        // Crear el gestor de reservas
        GestorReservas gestor = new GestorReservas();

        // Crear algunos clientes
        Cliente cliente1 = new Cliente("Juan", " Perez", "987654321", "juan@example.com", 12345678, "AV LOS OLIVOS");
        Cliente cliente2 = new Cliente("Maria", " Lopez", "912345678", "maria@example.com", 23165478, "PANAMERICANA");

        // Crear algunas habitaciones
        // Crear algunas habitaciones
        Habitacion hab1 = new HabitacionEstandar("101");
        Habitacion hab2 = new HabitacionDoble("102");
        Habitacion hab3 = new HabitacionFamiliar("103");
        Habitacion hab4 = new HabitacionSuite("104");

        // Crear algunas reservas
        Reserva reserva1 = gestor.crearReserva(cliente1, hab1, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5));
        Reserva reserva2 = gestor.crearReserva(cliente2, hab4, LocalDate.of(2025, 6, 10), LocalDate.of(2025, 6, 15));

        // Mostrar las reservas creadas
        System.out.println("\nReservas Actuales:");
        for (Reserva reserva : gestor.listarReservas()) {
            System.out.println(reserva);
        }

        // Intentar cancelar una reserva
        System.out.println("\nCancelando reserva con ID 1...");
        if (gestor.cancelarReserva(1)) {
            System.out.println("Reserva cancelada exitosamente.");
        } else {
            System.out.println("No se pudo cancelar la reserva.");
        }

        // Mostrar las reservas después de cancelar
        System.out.println("\nReservas Después de Cancelar:");
        for (Reserva reserva : gestor.listarReservas()) {
            System.out.println(reserva);
        }

    }

}
