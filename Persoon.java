package kantine;
import java.util.*;

public class Persoon {
	boolean vegetarier;
	double geld;
	int honger;
	
	Persoon(double geld, int honger, boolean vegetarier) {
		this.geld = geld;
		this.honger = honger;
		this.vegetarier = vegetarier;
	}
	
	Voedsel kopen(ArrayList<Voedsel> menu) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		Voedsel v = menu.get(input+1);
		
		
		return v;
	}
	
	
	void eten() {
		
		
	}
	
	public static void main(String[] args) {
		

	}
	
	
	
	
}
