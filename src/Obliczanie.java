import java.awt.List;
import java.util.ArrayList;

public class Obliczanie {
	private int liczba;
	private ArrayList <Integer> lista;

	public int getLiczba() {
		return liczba;
	}

	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}

	public Obliczanie(int liczba) {
		this.liczba = liczba;
	}

	public void funkcja() {
		ArrayList<Integer> tab = new ArrayList<Integer>();
		int reszta;
		int tmp;
		while (liczba != 0) {
			reszta = liczba % 2;
			tab.add(reszta);
			//System.out.println("Reszta " + reszta);
			liczba = liczba / 2;
			//System.out.println("Liczba " + liczba);
		}
		lista = tab;
	}
	public void wypisanieTablicy() {
		for(int i = lista.size() - 1; i >= 0; i--) {
			System.out.print(lista.get(i));
		}
	}
}
