import java.util.ArrayList;
import java.util.List;

public class Medico extends Trabajadores {

	private String especializacion;
	private String horarioDeAtencion;
	private String pacientesAsignados;
	private boolean experenciaCirujia;
	private boolean medicinaInterna;
	private boolean pediatria;
	private EspecialidadMedica especialidad;

	private List<EspecialidadMedica> especialidadesCLinicas;

	public Medico(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horario, String especializacion, String horarioDeAtencion, String pacientesAsignados, boolean experenciaCirujia, boolean medicinaInterna, boolean pediatria, EspecialidadMedica especialidad) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horario);
		this.especializacion = especializacion;
		this.horarioDeAtencion = horarioDeAtencion;
		this.pacientesAsignados = pacientesAsignados;
		this.experenciaCirujia = experenciaCirujia;
		this.medicinaInterna = medicinaInterna;
		this.pediatria = pediatria;
		this.especialidad = especialidad;
	}


	public EspecialidadMedica getEspecialidadMedica() {
		return especialidad;
	}

	public void setEspecialidadMedica(EspecialidadMedica especialidadMedica) {
		this.especialidad = especialidadMedica;
	}

	public List<Medico> obtenerMedicosEspecialidad(String nombreEspecialidad) {
		List<Medico> medicos = new ArrayList<>();
		for (EspecialidadMedica especialidad : especialidadesCLinicas) {
			if (especialidad.getNombre().equals(nombreEspecialidad)) {
				medicos.addAll(especialidad.getMedicos());
			}
		}
		return medicos;
	}


}

