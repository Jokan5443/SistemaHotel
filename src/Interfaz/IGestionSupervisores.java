package Interfaz;

import GestionEmpleados.Supervisor;

public interface IGestionSupervisores {
    void addSupervisor(Supervisor supervisor);
    void dropSupervisor(int idSupervisor);
    void dropSupervisor(Supervisor supervisor);
}

