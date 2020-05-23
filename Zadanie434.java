import java.util.*;

class Waluty {
	public static double PLNToEuro(double price) {
		double converter = 0.22;
		return price*converter;
	}
	public static double PLNToPound(double price) {
		double converter = 0.20;
		return price*converter;
	}
	public static double PoundToPLN(double price) {
		double converter = 4.98;
		return price*converter;
	}
	public static double EuroToPLN(double price) {
		double converter = 4.58;
		return price*converter;
	}
}

public class Zadanie434 {
	public static void main(String[] args) {
		
		Waluty n = new Waluty();
		System.out.println("1 - PLNToEuro | 2 - PLNToPound | 3 - PoundToPLN | 4 - EuroToPLN");
		
		Scanner cin = new Scanner(System.in);
		int wybor = cin.nextInt();
		
		double price = 10.00;
		if(wybor == 1) {
			System.out.println(n.PLNToEuro(price));
		}
		else if(wybor == 2) {
			System.out.println(n.PLNToPound(price));
		}
		else if(wybor == 3)  {
			System.out.println(n.PoundToPLN(price));
		}
		else if(wybor == 4) {
			System.out.println(n.EuroToPLN(price));
		}
		else {
			System.out.println("ERROR: Wprowadziles/-as zla liczbe!");
		}
		
		
		cin.close();
	}
}
