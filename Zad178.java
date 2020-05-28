import java.util.Arrays;
import java.util.Scanner;

class Ciag{
	int a1, q, n, ciag[];
	
	public Ciag() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Podaj a1: ");
		this.a1 = scan.nextInt();
		System.out.print("Podaj q: ");
		this.q = scan.nextInt();
		System.out.print("Podaj długość ciągu: ");
		this.n = scan.nextInt();
				
		this.stworz();
	}
	
	public Ciag(int a1, int q) {
		this.a1 = a1;
		this.q = q;
	}
	
	void stworz() {
		ciag = new int[n];
		ciag[0] = a1;
		
		for(int i = 1; i < n; i++)
		 ciag[i] = ciag[i-1]*q;
	}
	
	void pokazCiag() {
		for(int i = 0; i < 5; i++) {
			System.out.print(ciag[i]);
			if(i !=4) System.out.print(", ");
		}
		System.out.println();
	}
	
	void WyswietlCiag(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(ciag[i]);
			if(i != n-1) System.out.print(", ");
		}
		System.out.println();
	}
	double nWyraz() {
		return a1*Math.pow(q, n-1);
	}
	
	double suma() {
		return q == 1 ? n*a1 : a1*((1-Math.pow(q, n))/(1-q));
	}
	
	String porownaj(Ciag b) {
		return ((b.q == q) && (b.a1 == a1)) ? "Ciągi są równe" : "Ciągi są różne";
	}
	
	String sprawdz(int ... ciag) {
		for(int i = 2; i < ciag.length; i++) {
			if((ciag[i-1]/ciag[i-2]) == ciag[i]/ciag[i-1]) continue;
			
			return "Ciąg "+Arrays.toString(ciag)+" nie jest geometryczny";
		}
		
		return "Ciąg "+Arrays.toString(ciag)+" jest geometryczny";
	}
}

public class Zad178 {
	public static void main(String[] args) {
		Ciag ciag = new Ciag();
		
		System.out.println();
		
		System.out.print("Ciąg 5 wyrazów: ");
		ciag.pokazCiag();
		System.out.print("Ciąg "+ciag.n+" wyrazów: ");
		ciag.WyswietlCiag(ciag.n);
		System.out.println("Wartość "+ciag.n+" wyrazu: "+(int) ciag.nWyraz());
		System.out.println("Suma "+ciag.n+" wyrazów: "+(int) ciag.suma());
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Podaj a1 drugiego ciągu: ");
		int a1 = scan.nextInt();
		System.out.print("Podaj q drugiego ciągu: ");
		int q = scan.nextInt();
		Ciag ciag2 = new Ciag(a1, q);
		System.out.println(ciag.porownaj(ciag2));
		
		scan.close();
		System.out.println();
		
		System.out.println(ciag.sprawdz(4, 2, 1));
		System.out.println(ciag.sprawdz(4, 1, 5, 7, 3, 10));
	}
}
