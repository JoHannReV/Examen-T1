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
}