package salondelajusticia;

public class AsistenteConHabilidades extends Asistente {
	private String nombreHabilidad;
	
	public AsistenteConHabilidades() {
	}

	public AsistenteConHabilidades(int sueldo, String nombreHabilidad) {
		this.nombreHabilidad= nombreHabilidad;
	}
	
	

	
	public float salario() {
		return getSueldo()*1.2f;
	}


	public String getNombreHabilidad() {
		return nombreHabilidad;
	}


	public void setNombreHabilidad(String nombreHabilidad) {
		this.nombreHabilidad = nombreHabilidad;
	}
	


}


