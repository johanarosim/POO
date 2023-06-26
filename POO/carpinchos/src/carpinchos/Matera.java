package carpinchos;

public class Matera extends equipoDeMate {

	private float kilosYerba;
	
	

	public boolean tienenParaTodoElDia() {
		return getLitrosAgua() == 5 && kilosYerba > 2;
	}
	
	public float cache() {
		return 100;
	}
	///
	public float getKilosYerba() {
		return kilosYerba;
	}

	public void setKilosYerba(float kilosYerba) {
		this.kilosYerba = kilosYerba;
	}
}

