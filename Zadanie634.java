class Trojkat{
    public static double obwTrojkata(int a, int b, int c) {
		return a+b+c;
	}
	public static double poleTrojkata(int a, int h) {
		return (a*h)/2;
	}
	public static boolean iTrojkat(int a, int b, int c) {
		if(a+b > c && a+c > b && b+c > a) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Zadanie634 {
	public static void main(String[] args) {
		int a = 7;
		int b = 6;
		int c = 2;
		int h = 6;
		
		Trojkat t = new Trojkat();
		if(t.iTrojkat(a, b, c) == true) {
			System.out.println("Trójkąt istnieje!");
		}
		else {
			System.out.println("Trójkąt nie istnieje!");
		}
		System.out.println("Obwód: " + t.obwTrojkata(a, b, c));
		System.out.println("Pole: " + t.poleTrojkata(a, h));
	}
}
