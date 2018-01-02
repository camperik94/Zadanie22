import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj liczbe");
		
		int liczba = in.nextInt();
		
		Obliczanie obl = new Obliczanie(liczba);
		
		obl.funkcja();
		
		obl.wypisanieTablicy();
	}
}
