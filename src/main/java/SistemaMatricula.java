import java.time.LocalDate;
public class SistemaMatricula {

    public String registrar(Matricula m) {
        // 1. Validación de campos vacíos o nulos
        if (m.codigoMatricula() == null || m.codigoMatricula().isBlank() ||
                m.nombreEstudiante() == null || m.nombreEstudiante().isBlank() ||
                m.codigoCurso() == null || m.codigoCurso().isBlank() ||
                m.creditos() == null || m.fechaMatricula() == null) {
            return "Debe ingresar todos los datos requeridos";
        }

// 2. Validación del código de matrícula (2 Letras Mayúsculas + 4 números)
        if (!m.codigoMatricula().matches("^[A-Z]{2}\\d{4}$")) {
            return "Ingrese un código de matrícula válido";
        }

        // 3. Validación del nombre (solo letras y espacios, mínimo 4 caracteres)
        if (!m.nombreEstudiante().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]{4,}$")) {
            return "El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos";
        }

        // 4. Validación del código de curso (5 caracteres alfanuméricos)
        if (!m.codigoCurso().matches("^[A-Za-z0-9]{5}$")) {
            return "Ingrese un código de curso válido";
        }

        // 5. Validación de créditos (entre 1 y 6)
        if (m.creditos() < 1 || m.creditos() > 6) {
            return "La cantidad de créditos debe estar entre 1 y 6";
        }

/*        // 6. Validación de fecha (menor o igual a hoy)
        if (m.fechaMatricula().isAfter(LocalDate.now())) {
            return "Ingrese una fecha de matrícula válida";
        }
*/
        // 7. Si todo es correcto
        return "La matricula ha sido registrada correctamente";
    }
}