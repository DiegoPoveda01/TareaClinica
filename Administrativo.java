public class Administrativo extends Trabajador {
	private String email;
	private EspecializaconMedica especializacionmedica;

	public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, String email, EspecializaconMedica especializacionmedica) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
		this.email = email;
		this.especializacionmedica = especializacionmedica;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public EspecializaconMedica getEspecializacionMedica(){
		return this.especializacionmedica;
	}
	public void setEspecializacionMedica(EspecializaconMedica especializacionmedica){
		this.especializacionmedica= especializacionmedica;
	}

	public String getTipo() {
		return "Administrativo";
	}
}