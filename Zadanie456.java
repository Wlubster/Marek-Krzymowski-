import java.util.Scanner;
public class Zadanie456 {
    private String a;

    public Zadanie456(String a) {

        this.a = a;
        if(sprawdzPalindrom(a) == true) {
            System.out.println("Jest to Palindrom!");
        }
        else {
            System.out.println("Niestety nie jest to Palindrom");
        }

    }

    public boolean sprawdzPalindrom(String a) {
        int h = a.length();

        int kk = 0;
        int k = (h - 1);
        for(int i = 0; i < h; i++) {
            if(a.charAt(i) != a.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }
        if(kk == 1) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sprawdz palindrom: ");
        String a = s.nextLine();

        Zadanie456 zad = new Zadanie456(a);

    }
}
