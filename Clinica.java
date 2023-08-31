import java.util.*;

public class Clinica {

	private Collection<Trabajadores> trabajadores;
	private Collection<EspecialidadMedica> especialidadesCLinicas;
	private String nombreClinica;
	private String direccionAsociada;
	private String tipoDeClinica;
	public List<Medico> obtenerMedicos() {
		List<Medico> medicos = new ArrayList<>();
		for (Trabajadores trabajador : trabajadores) {
			if (trabajador instanceof Medico) {
				medicos.add((Medico) trabajador);
			}
		}
		return medicos;
	}
	public List<Administrativo> obtenerAdministrativos() {
		List<Administrativo> administrativos = new ArrayList<>();
		for (Trabajadores trabajador : trabajadores) {
			if (trabajador instanceof Administrativo) {
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}
	public List<Medico> obtenerMedicosEspecialidad(String nombreEspecialidad) {
		List<Medico> medicos = new ArrayList<>();
		for (EspecialidadMedica especialidad : especialidadesClinicas) {
			if (especialidad.getNombre().equals(nombreEspecialidad)) {
				for (Medico medico : especialidad.getMedicos()) {
					medicos.add(medico);
				}
			}
		}
		return medicos;
	}
	public Administrativo obtenerAdministrativo(String nombre, String rut) {
		for (EspecialidadMedica especialidad : especialidadesClinicas) {
			Administrativo administrativo = especialidad.getAdministrativo();
			if (administrativo != null) {
				if (nombre != null && administrativo.getNombre().equals(nombre)) {
					return administrativo;
				} else if (rut != null && administrativo.getRut().equals(rut)) {
					return administrativo;
				}
			}
		}
		return null;
	}


}
