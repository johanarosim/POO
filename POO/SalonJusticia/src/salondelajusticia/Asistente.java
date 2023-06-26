package salondelajusticia;
public class Asistente extends Vigilante {

	private float sueldo;

	public Asistente() {
		// TODO Auto-generated constructor stub
	}

	public Asistente(int sueldo) {
		this.sueldo = sueldo;
	}

	
	public float salario() {
		return sueldo;
	}
	public boolean GanaMasDe60000() {
		return salario() > 60000;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
}

