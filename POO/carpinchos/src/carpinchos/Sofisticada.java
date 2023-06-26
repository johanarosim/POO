package carpinchos;


public class Sofisticada extends equipoDeMate{

	private float jamon;

	public float cache() {
		return 100- getLitrosAgua()*jamon;
	}
	
	///
	public float getJamon() {
		return jamon;
	}

	public void setJamon(float jamon) {
		this.jamon = jamon;
	}
	
}

