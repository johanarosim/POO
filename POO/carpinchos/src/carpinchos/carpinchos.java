package carpinchos;

import java.util.ArrayList;

public class carpinchos {
	
	private ArrayList<carpincho> carpinchos = new ArrayList<>();
	public carpincho elMasMatero(){
		carpincho masMatero= this.carpinchos.get(0);
		for (carpincho carpincho: carpinchos) {
			if (carpincho.getGustoPorElMate()> masMatero.getGustoPorElMate()) {
				masMatero = carpincho;	
			}
		}
		return masMatero;
	}
	
	public ArrayList<carpincho> losQueTomanMateTodoElDia() {
		ArrayList<carpincho> bebedores = new ArrayList<carpincho>();
		for (carpincho carpincho : bebedores) {
			if (carpincho.TomaMateTodoEldia()) {
				bebedores.add(carpincho);
			}
		}
		return bebedores;
	}
	
	public boolean yaNoSePuedeDescansarLaVista() {
		int n = 0;
		for (carpincho carpincho : carpinchos) {
			if(carpincho.TomaMateTodoEldia()) {
				n = n + 1;
			}	
		}
		return n > 0.7f*carpinchos.size();
	}
	
	public float numeroTotalDeCache() {
		float c=0;
		for (carpincho carpincho:carpinchos) {
		c= c + carpincho.nivelCache();
		}
		return c;
	}
	
	public boolean estamosEnLaBristol() {
		return numeroTotalDeCache()/carpinchos.size() > 80;
	}

}

