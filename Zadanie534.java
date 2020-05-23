class Measure {
	public static double KMToMiles(double distance) {
		return distance*0.621371192;
	}
	public static double MToMiles(double distance) {
		return distance*0.000621371192;
	}
}

public class Zadanie534 {
	public static void main(String[] args) {
		double distance = 100;
		
		Measure n = new Measure();
		
		
		System.out.println(distance + "Km to: " + n.KMToMiles(distance) + " mil.");
		System.out.println(distance + "m to: " + n.KMToMiles(distance) + " mil.");
	}
}
