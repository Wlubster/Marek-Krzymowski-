import java.util.Random;

public class zadanie134{
	
	public static void main(String[] args) {
		int tab[] = new int[10];
		
		Random r = new Random();
		for(int i = 0; i<10; i++) {
			tab[i] = r.nextInt(100);
			System.out.print(tab[i] + " ");
				
		}
		System.out.println("");
		for(int i = 0; i<10; i++) {
			System.out.print(tab[i]/2 + " ");
		}
		
	}
	
	
}
