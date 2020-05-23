import java.util.Scanner;
public class Zadanie256 {
    private String Imie;
    private String Nazwisko;

    private String IN;

    public String podajImie() {
        System.out.println("Podaj swoje imie: ");
        Scanner I = new Scanner(System.in);
        return I.nextLine();
    }

    public String podajNazwisko() {
        System.out.println("Podaj swoje nazwisko: ");
        Scanner N = new Scanner(System.in);
        return N.nextLine();
    }
    public Zadanie256() {
        this.Imie = podajImie();
        this.Nazwisko = podajNazwisko();

        this.IN = Imie + " " + Nazwisko;

        System.out.println("Nazywasz sie: " + IN.toUpperCase());
    }

    public static void main(String[] args) {
        Zadanie256 Zadanie = new Zadanie256();
    }
    
}
