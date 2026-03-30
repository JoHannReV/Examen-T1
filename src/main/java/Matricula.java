import java.time.LocalDate;

public record Matricula(
        String codigoMatricula,
        String nombreEstudiante,
        String codigoCurso,
        Integer creditos,
        LocalDate fechaMatricula
) {}