
public class Pokemon {

	private String nombre;
	private int nivelVenganza;
	
	public boolean nivelDeVenganzaMayor() {
		return nivelVenganza>80;
	}
	private boolean esPeligroso(int x) {
		return nivelVenganza + x >= 100;
	}
	
	public boolean esInfiltrado() {
		return nivelVenganza == 0 && nombre == null;
	}
	//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivelVenganza() {
		return nivelVenganza;
	}
	public void setNivelVenganza(int nivelVenganza) {
		this.nivelVenganza = nivelVenganza;
	}
	
}
