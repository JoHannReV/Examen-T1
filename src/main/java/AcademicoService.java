public interface AcademicoService {
    boolean tienePrerrequisitos(String alumnoId, String cursoId);
    boolean tieneCruceHorario(String alumnoId, String cursoId);
    int obtenerVacantes(String cursoId);
}
