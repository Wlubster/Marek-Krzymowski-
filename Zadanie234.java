public class Zadanie234 {
	public static void main(String[] args) {
		int uczelnia[] = new int[31];
		int dni = 1;
		for(int i = 1; i<31; i++) {
			if(dni == 2) {
				uczelnia[i] = 8;
				dni++;
			}
			else if (dni == 3) {
				uczelnia[i] = 4;
				dni++;
			}
			else if(dni == 4) {
				uczelnia[i] = 10;
				dni++;
			}
			else {
				uczelnia[i] = 0; 
				dni++;
			}
			System.out.print(uczelnia[i] + " ");
			
			if(dni > 7) {
				dni = 1;
				System.out.println();
			}
			
		}
	}
}
