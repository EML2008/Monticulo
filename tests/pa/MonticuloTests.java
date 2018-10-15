package pa;

import java.util.Comparator;

import org.junit.Test;

public class MonticuloTests {

	@Test
	public void pruebasSobreMonticulo() {
		Comparator<Integer> comparador = new IntCompare();
		// Monticulo de Maxima
		Monticulo<Integer> m = new Monticulo<>(comparador);
		m.agregarAMonticulo(3);
		m.agregarAMonticulo(20);
		m.agregarAMonticulo(27);
		m.agregarAMonticulo(45);
		m.agregarAMonticulo(59);
		m.agregarAMonticulo(15);
		System.out.println(m);
		
		m.agregarAMonticulo(70);
		
		//m.agregarAMonticulo(26);
		//m.agregarAMonticulo(60);
		
		System.out.println(m);
		
		m.sacarDeMonticulo();
		System.out.println(m);
		
	}

}
