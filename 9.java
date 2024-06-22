import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Example5_9 {
    public static void main(String[] args) {
        Date now = new Date();
        DateFormat formatter = DateFormat.getDateInstance();
        System.out.println("Default date : " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
        System.out.println("Short (UK): " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Medium: " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Long: " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Full: " + formatter.format(now));
    }
}
