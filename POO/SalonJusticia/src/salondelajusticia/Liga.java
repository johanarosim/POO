package salondelajusticia;

import java.util.ArrayList;

public class Liga {

	private ArrayList<Vigilante> vigilantes = new ArrayList<>();
	private ArrayList<Asistente> asistentes = new ArrayList<>();
	
	public int cantidadTotalDeAsistentesQueGananMas() {
		int c=0;
		for (Vigilante vigilante:vigilantes) {
		c= c + vigilante.asistentesGananMasDe60mil();
		}
		return c;
	}
	
	public ArrayList<Vigilante> vigilantesConMasAsistentes() {
		ArrayList<Vigilante> masAsistentes = new ArrayList<Vigilante>();
		for (Vigilante vigilante : masAsistentes) {
			if (vigilante.cantidadAsistentes() > 3) {
				masAsistentes.add(vigilante);
			}
		}
		return masAsistentes;
	}
	
	public float vaquita() {
		float c = 0;
		for (Vigilante vigilante : vigilantes) {
			c= c + vigilante.restante();
		}
		return c;
	}
	
	
}

