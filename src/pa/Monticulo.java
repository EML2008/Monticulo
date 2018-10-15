package pa;

import java.util.ArrayList;
import java.util.Comparator;

public class Monticulo<T> {
	public ArrayList<T> vector;
	public int tope;
	public Comparator<T> comparador;

	public Monticulo(Comparator<T> comparador) {
		this.vector = new ArrayList<>();
		this.vector.add(null); // No se utiliza la primera posicion
		this.comparador = comparador;
	}

	public void agregarAMonticulo(T obj) {
		this.tope++;
		this.vector.add(obj);
		if (this.tope > 1) {
			int j = this.tope;
			int i = this.tope / 2;
			T aux;
			while (i >= 1 && comparador.compare(this.vector.get(i), this.vector.get(j)) < 0) {
				aux = this.vector.get(i);
				this.vector.set(i, this.vector.get(j));
				this.vector.set(j, aux);
				j = i;
				i /= 2;
			}
		}
	}

	public T sacarDeMonticulo() {
		if (this.tope < 1)
			return null;
		T raiz = this.vector.get(1);
		this.vector.set(1, this.vector.get(tope));
		this.vector.remove(tope);
		this.tope--;
		
		int i = 1;
		int hi = i * 2; 
		int hd = i * 2 + 1;
		
		if (hd > tope)
			hd = hi;

		while (i < tope && hi <= tope && (comparador.compare(this.vector.get(i), this.vector.get(hi)) < 0
				|| comparador.compare(this.vector.get(i), this.vector.get(hd)) < 0)) {

			if (comparador.compare(this.vector.get(i), this.vector.get(hd)) < 0) {
				T aux = this.vector.get(i);
				this.vector.set(i, this.vector.get(hd));
				this.vector.set(hd, aux);
				i = hd;
			}

			else {
				T aux = this.vector.get(i);
				this.vector.set(i, this.vector.get(hi));
				this.vector.set(hi, aux);
				i = hi;
			}

			hi = i * 2;
			hd = i * 2 + 1;
			if (hd > tope)
				hd = hi;
		}

		return raiz;
	}

	@Override
	public String toString() {
		return "Monticulo:" + vector.toString();
	}

}
