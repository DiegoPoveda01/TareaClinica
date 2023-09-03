public abstract class Trabajador {
	private String tituloProfesional;
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private String horarioTrabajo;
	public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo){
		this.tituloProfesional = tituloProfesional;
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horarioTrabajo = horarioTrabajo;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public abstract String getTipo();

	public String getHorarioTrabajo() {
		return this.horarioTrabajo;
	}

	public void setHorarioTrabajo(String horarioTrabajo) {
		this.horarioTrabajo = horarioTrabajo;
	}
}