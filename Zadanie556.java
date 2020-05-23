import java.util.Scanner;

public class Zadanie556 {

    private final int N_CHARS = 26;
    private int[] count = new int[N_CHARS];

    private String a;
    private String b;

    private int rotate = 0;

    public Zadanie556() {

        if(this.rotate == 0) {
            this.a = getWord('a');
            this.rotate++;
        }
        if(this.rotate != 0) {
            this.b = getWord('b');
            this.rotate = 0;
        }


        if(isAnagram(this.a, this.b)) {
            System.out.println("Nie udalo sie!");
        }
        else {
            System.out.println("Udalo sie!");
        }
    }

    public String getWord(char letter) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj " + letter);
        return s.nextLine();
    }

    public boolean isAnagram(String a, String b) {
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();

        if(ac.length != bc.length) {
            return false;
        }

        for(int i = 0; i < ac.length; i++) {
            this.count[ac[i] - 97]++;
            this.count[bc[i] - 97]--;
        }

        for(int i = 0; i<26; i++) {
            if(this.count[i] != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Zadanie556 zad = new Zadanie556();
    }
}
