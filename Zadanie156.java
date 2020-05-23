import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadanie156 {

    public static void main(String[] args) {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        System.out.println("Data: " + s.format(d));

    }


}
