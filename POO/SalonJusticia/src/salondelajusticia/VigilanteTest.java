package salondelajusticia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VigilanteTest {

	@Test
	void salarioTotalMixto() {
		
		Asistente a = new Asistente ();
		a.setSueldo(4500);
		Asistente b = new AsistenteConHabilidades ();
		b.setSueldo(3600);
		Vigilante vigilante = new Vigilante ();
		vigilante.agregar(a);
		vigilante.agregar(b);
		b.salario();
		
		assertEquals(8820, vigilante.salarioTotal());
	}

	@Test
	void salarioTotalSoloAsistente() {
		Vigilante vigilante = new Vigilante ();
		Asistente a = new Asistente ();
		a.setSueldo(4500);
		Asistente b = new Asistente ();
		b.setSueldo(5000);
		vigilante.agregar(a);
		vigilante.agregar(b);
		
		assertEquals(9500, vigilante.salarioTotal());
		
	}
	
	@Test
	void salarioTotalSoloAsistenteCH() {
		Asistente a = new AsistenteConHabilidades ();
		a.setSueldo(5000);
		Asistente b = new AsistenteConHabilidades ();
		b.setSueldo(5000);
		Vigilante vigilante = new Vigilante ();
		vigilante.agregar(a);
		a.salario();
		vigilante.agregar(b);
		b.salario();
		
		assertEquals(12000, vigilante.salarioTotal());
	}
}

