
public class Pokebola {
	
	private float tiempo;
	private String tipo;
	private Pokemon pokemon;
	
	
	private boolean esValiosa() {
		return tipo == "master" || tipo == "lujo";
	}
	public boolean esAptoParaDominar() {
		return tiempo > 1 && this.pokemon.nivelDeVenganzaMayor();
	}
	public boolean pokebolaAlgoAndaMal() {
		return this.pokemon.esInfiltrado();
	}
	//
	public float getTiempo() {
		return tiempo;
	}
	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

}
