package salondelajusticia;

import java.util.ArrayList;

public class Vigilante {

	private String nombre;
	private int presupuesto;
	
	
	private ArrayList<Asistente> asistentes = new ArrayList<>();
	
	public Vigilante() {
	}
	
	public Vigilante(String nombre, int presupuesto) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public int asistentesGananMasDe60mil() {
		int c = 0;
		
		for (Asistente asistente : asistentes) {
		if (asistente.GanaMasDe60000()) {
			c++;
		}
			}
		return c;

	}
	
	public int cantidadAsistentes() {
		return asistentes.size();
	}
	
	public boolean noLlegaAfinDeMes() {
		return salarioTotal() > presupuesto;
	}
	
	public float salarioTotal() {
		float c=0;
		for (Asistente asistente:asistentes) {
		c= c + asistente.salario();
		}
		return c;
	}


	public float restante() {
		return presupuesto - salarioTotal();
	}
	///
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	


	
}

