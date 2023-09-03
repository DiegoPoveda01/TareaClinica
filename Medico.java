public class Medico extends Trabajador {
	private int pacientes;
	private EspecializaconMedica especializacionmedica;

	public Medico(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, int pacientes, EspecializaconMedica especializacionmedica) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
		this.pacientes = pacientes;
		this.especializacionmedica = especializacionmedica;
	}

	public int getPacientes() {
		return this.pacientes;
	}

	public void setPacientes(int pacientes) {
		this.pacientes = pacientes;
	}
	public EspecializaconMedica getEspecializacionMedica(){
		return this.especializacionmedica;
	}
	public void setEspecializacionMedica(EspecializaconMedica especializacionmedica){
		this.especializacionmedica= especializacionmedica;
	}

	public String getTipo() {
		return "Medico";
	}

}