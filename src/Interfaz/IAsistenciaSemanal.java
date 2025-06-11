package Interfaz;

import java.time.LocalDateTime;

public interface IAsistenciaSemanal {
    void registrarAsistencia(LocalDateTime fecha, boolean presente);
    int obtenerFaltasSemana();
}
