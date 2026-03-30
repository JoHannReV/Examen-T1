import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MatriculaGestorTest {

    @Mock
    private AcademicoService academicoService;

    @Mock
    private BecaService becaService;

    @InjectMocks
    private MatriculaGestor gestor;
    @Test
    void test01_FaltaPrerrequisito_DebeRetornarError() {
        when(academicoService.tienePrerrequisitos("ALU01", "CUR01")).thenReturn(false);

        String resultado = gestor.procesarMatricula("ALU01", "CUR01", 10, false);

        assertEquals("Error: No cumple con los prerrequisitos", resultado);
    }

//test 2
@Test
void test02_HorarioCruzado_DebeRetornarError() {
    when(academicoService.tienePrerrequisitos("ALU01", "CUR02")).thenReturn(true);
    when(academicoService.tieneCruceHorario("ALU01", "CUR02")).thenReturn(true);

    String resultado = gestor.procesarMatricula("ALU01", "CUR02", 4, false);

    assertEquals("Error: El curso tiene cruce de horario", resultado);
}

}