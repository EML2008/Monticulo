package pa;

import java.util.Comparator;


//Se la hace implementar de Comparator para que el monticulo no quede "atado" a una clase comparadora en concreto.

public class IntCompare implements Comparator<Integer> { 

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}

	
}
