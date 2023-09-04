import java.util.ArrayList;
import java.util.List;
public class Clinica {

    private List<EspecialidadMedica> especialidadesClinicas;

    public List<Medico> obtenerTodosLosMedicos() {
        List<Medico> medicos = new ArrayList<>();
        for (EspecialidadMedica especialidad : especialidadesClinicas) {
            medicos.addAll(especialidad.getMedicos());
        }
        return medicos;
    }
}
