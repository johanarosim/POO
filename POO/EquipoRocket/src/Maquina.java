import java.util.ArrayList;

public class Maquina {

	
	private ArrayList<Pokebola> pokebolas = new ArrayList<>();
	
	public ArrayList<Pokebola> losAptosParaDominar() {
		ArrayList<Pokebola> aptos = new ArrayList<Pokebola>();
		for (Pokebola pokebola : aptos) {
			if (pokebola.esAptoParaDominar()) {
				aptos.add(pokebola);
			}
		}
		return aptos;
	}
	
	public boolean algoAndaMal() {
		for (Pokebola pokebola : pokebolas) {
			if (pokebola.pokebolaAlgoAndaMal()) {
				return true;
			}
		}
		return false;	
		
	}
	
	
}
