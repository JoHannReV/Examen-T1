public class MatriculaGestor {
    private AcademicoService academicoService;
    private BecaService becaService;

    public MatriculaGestor(AcademicoService academicoService, BecaService becaService) {
        this.academicoService = academicoService;
        this.becaService = becaService;
    }

    public String procesarMatricula(String aluId, String curId, int creditos, boolean esNuevo) {
        if (!academicoService.tienePrerrequisitos(aluId, curId)) {
            return "Error: No cumple con los prerrequisitos";
        }

        // 2. Validar Cruce de Horario
        if (academicoService.tieneCruceHorario(aluId, curId)) {
            return "Error: El curso tiene cruce de horario";
        }

        return "Matrícula Exitosa";
    }
}