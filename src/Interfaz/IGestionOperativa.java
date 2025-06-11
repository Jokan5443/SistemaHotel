package Interfaz;

import GestionEmpleados.Operario;

  public interface IGestionOperativa {
    void addOperario(Operario operario);
    void dropOperario(int idOperario);
    void dropOperario(Operario operario);
}