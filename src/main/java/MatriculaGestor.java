public class MatriculaGestor {
    private AcademicoService academicoService;
    private BecaService becaService;

    public MatriculaGestor(AcademicoService academicoService, BecaService becaService) {
        this.academicoService = academicoService;
        this.becaService = becaService;
    }

    public String procesarMatricula(String aluId, String curId, int creditos, boolean esNuevo) {
        return "";
    }
}