import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SistemaMatriculaTest {

    private SistemaMatricula sistema;

    @BeforeEach
    void setUp() {
        sistema = new SistemaMatricula();
    }

    @Test
    void test01_CamposVacios_DebeRetornarError() {
        // Arrange (Preparar)
        Matricula matriculaIncompleta = new Matricula("", "Juan", "MAT01", 4, LocalDate.now());

        // Act (Actuar)
        String resultado = sistema.registrar(matriculaIncompleta);

        // Assert (Afirmar)
        assertEquals("Debe ingresar todos los datos requeridos", resultado);
    }

    @Test
    void test02_CodigoMatriculaInvalido_DebeRetornarError() {
        // Código inválido: minúsculas y faltan números (in123)
        Matricula matricula = new Matricula("in123", "Juan Perez", "MAT01", 4, LocalDate.now());

        String resultado = sistema.registrar(matricula);

        assertEquals("Ingrese un código de matrícula válido", resultado);
    }
/*
    @Test
    void test03_NombreEstudianteCorto_DebeRetornarError() {
        // Nombre con menos de 4 letras ("Ana")
        Matricula matricula = new Matricula("IN1234", "Ana", "MAT01", 4, LocalDate.now());

        String resultado = sistema.registrar(matricula);

        assertEquals("El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos", resultado);
    }

    @Test
    void test04_CodigoCursoInvalido_DebeRetornarError() {
        // Código de curso con 6 caracteres en lugar de 5 ("MAT012")
        Matricula matricula = new Matricula("IN1234", "Juan Perez", "MAT012", 4, LocalDate.now());

        String resultado = sistema.registrar(matricula);

        assertEquals("Ingrese un código de curso válido", resultado);
    }

    @Test
    void test05_CreditosFueraDeRango_DebeRetornarError() {
        // Créditos igual a 7 (rango válido 1-6)
        Matricula matricula = new Matricula("IN1234", "Juan Perez", "MAT01", 7, LocalDate.now());

        String resultado = sistema.registrar(matricula);

        assertEquals("La cantidad de créditos debe estar entre 1 y 6", resultado);
    }

    @Test
    void test06_TodosLosDatosCorrectos_DebeRegistrarExitosamente() {
        // Todos los datos válidos
        Matricula matricula = new Matricula("IN1234", "Juan Perez", "MAT01", 5, LocalDate.now());

        String resultado = sistema.registrar(matricula);

        assertEquals("La matrícula ha sido registrada correctamente", resultado);
    }
*/
}
