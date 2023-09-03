import java.util.ArrayList;

public class Clinica {
	private String nombre;
	private String direcciones;
	private String tipoClinica;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

	public Clinica(String nombre, String direcciones, String tipoClinica) {
		this.nombre = nombre;
		this.direcciones = direcciones;
		this.tipoClinica = tipoClinica;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecciones() {
		return this.direcciones;
	}

	public void setDirecciones(String direcciones) {
		this.direcciones = direcciones;
	}

	public String getTipoClinica() {
		return this.tipoClinica;
	}

	public void setTipoClinica(String tipoClinica) {
		this.tipoClinica = tipoClinica;
	}

	public ArrayList<Medico> obtenerMedicos() {
		ArrayList<Medico> medicos = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Medico) {
				medicos.add((Medico) trabajador);
			}
		}
		return medicos;
	}

	public ArrayList<Administrativo> obtenerAdministrativos() {
		ArrayList<Administrativo> administrativos = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Administrativo) {
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}


	public ArrayList<Medico> obtenerMedicosPorEspecializacion(EspecializaconMedica especializacion) {
		ArrayList<Medico> medicosPorEspecializacion = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Medico) {
				Medico medico = (Medico) trabajador;
				if (medico.getEspecializacionMedica().equals(especializacion)) {
					medicosPorEspecializacion.add(medico);
				}
			}
		}
		return medicosPorEspecializacion;
	}


	public ArrayList<Administrativo> obtenerAdministrativosPorEspecializacion(EspecializaconMedica especializacion) {
		ArrayList<Administrativo> administrativosPorEspecializacion = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Administrativo) {
				Administrativo administrativo = (Administrativo) trabajador;
				if (administrativo.getEspecializacionMedica().equals(especializacion)) {
					administrativosPorEspecializacion.add(administrativo);
				}
			}
		}
		return administrativosPorEspecializacion;
	}
	public static Clinica iniciarClinica() {
		// Crear una instancia de la clínica
		Clinica miClinica = new Clinica("Clinica Alemana", "Anibal Pinto 23", "Privada");
EspecializaconMedica Cirujano = new EspecializaconMedica("Cirujano");
EspecializaconMedica Dermatologo = new EspecializaconMedica("Dermatologo");
		// Crear médicos y administrativos
		Medico medico1 = new Medico("Médico", "Dr. Juan", "456 Calle Secundaria", "Casado", "12345", "Horario1", 20, Cirujano);
		Medico medico2 = new Medico("Médico", "Dra. María", "789 Calle Terciaria", "Soltera", "67890", "Horario2", 15, Dermatologo);

		Administrativo admin1 = new Administrativo("Administrativo", "Ana", "101 Calle Cuarta", "Divorciada", "54321", "Horario3", "ana@example.com", Cirujano);
		Administrativo admin2 = new Administrativo("Administrativo", "Pedro", "202 Calle Quinta", "Soltero", "98765", "Horario4", "pedro@example.com", Dermatologo);

		// Agregar médicos y administrativos a la clínica
		miClinica.trabajadores.add(medico1);
		miClinica.trabajadores.add(medico2);
		miClinica.trabajadores.add(admin1);
		miClinica.trabajadores.add(admin2);

		// Mostrar los datos de la clínica
		System.out.println("Datos de la Clínica:");
		System.out.println("Nombre de la Clínica: " + miClinica.getNombre());
		System.out.println("Dirección de la Clínica: " + miClinica.getDirecciones());
		System.out.println("Tipo de Clínica: " + miClinica.getTipoClinica());

		// Mostrar información de los médicos
		System.out.println("\nMédicos en la clínica:");
		for (Medico medico : miClinica.obtenerMedicos()) {
			System.out.println("Nombre: " + medico.getNombre() + ", Pacientes: " + medico.getPacientes());
			System.out.println("Especialización Médica: " + medico.getEspecializacionMedica().getNombre());
		}

		// Mostrar información de los administrativos
		System.out.println("\nAdministrativos en la clínica:");
		for (Administrativo admin : miClinica.obtenerAdministrativos()) {
			System.out.println("Nombre: " + admin.getNombre() + ", Email: " + admin.getEmail());
			System.out.println("Especialización Médica: " + admin.getEspecializacionMedica().getNombre());
		}

		// Mostrar médicos y administrativos por especialidad
		System.out.println("\nMédicos por especialidad (Cirujano):");
		for (Medico medico : miClinica.obtenerMedicos()) {
			if (medico.getEspecializacionMedica().equals(Cirujano)) {
				System.out.println("Nombre: " + medico.getNombre());
			}
		}

		System.out.println("\nMédicos por especialidad (Dermatologo):");
		ArrayList<Medico> medicosDermatologos = miClinica.obtenerMedicosPorEspecializacion(Dermatologo);
		for (Medico medico : medicosDermatologos) {
			System.out.println("Nombre: " + medico.getNombre());
		}

		// Mostrar administrativos por especialidad
		System.out.println("\nAdministrativos por especialidad (Cirujano):");
		ArrayList<Administrativo> administrativosCirujanos = miClinica.obtenerAdministrativosPorEspecializacion(Cirujano);
		for (Administrativo admin : administrativosCirujanos) {
			System.out.println("Nombre: " + admin.getNombre());
		}

		System.out.println("\nAdministrativos por especialidad (Dermatologo):");
		ArrayList<Administrativo> administrativosDermatologos = miClinica.obtenerAdministrativosPorEspecializacion(Dermatologo);
		for (Administrativo admin : administrativosDermatologos) {
			System.out.println("Nombre: " + admin.getNombre());
		}

		return miClinica;
	}

}









