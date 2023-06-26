package carpinchos;

public class carpincho {
	private String nombre;
	private Matera matera;
	private equipoDeMate a;
	public boolean TomaMateTodoEldia() {
		return matera.tienenParaTodoElDia();
	}
	
	public float nivelCache() {
		return a.cache();
	}
	///
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGustoPorElMate() {
		return gustoPorElMate;
	}
	public void setGustoPorElMate(int gustoPorElMate) {
		this.gustoPorElMate = gustoPorElMate;
	}
	private int gustoPorElMate;
	

}

