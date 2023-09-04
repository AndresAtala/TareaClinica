import java.util.ArrayList;
import java.util.List;
public class EspecialidadMedica {

	Administrativo administrativo;
	Medico medico;

	public List<Medico> getMedicos() {
		List<Medico> medicos = new ArrayList<>();
		for (Medico medico : medicos) {
			if (medico.getEspecialidad().equals(this.nombre)) {
				medicos.add(medico);
			}
		}
		return medicos;
	}

}