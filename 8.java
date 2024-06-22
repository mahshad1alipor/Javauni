import java.text.*;

public class Example5_8 {
    public static void main(String[] args) {
        // Creating a NumberFormat instance
        NumberFormat formatter = NumberFormat.getNumberInstance();

        // Setting maximum fraction digits to 5
        formatter.setMaximumFractionDigits(5);
        System.out.println("Truncated PI = " + formatter.format(Math.PI));

        // Setting minimum integer digits to 4
        formatter.setMinimumIntegerDigits(4);
        System.out.println("Truncated PI = " + formatter.format(Math.PI));

        // Creating a NumberFormat instance for currency
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Money symbol usage: " + money.format(3.53));

        // Creating a NumberFormat instance for percent
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("Percent symbol usage: " + percent.format(0.353));

        // Creating a DecimalFormat instance
        DecimalFormat formatting = (DecimalFormat) NumberFormat.getNumberInstance();

        // Setting decimal separator always shown to true
        formatting.setDecimalSeparatorAlwaysShown(true);
        System.out.println("Show decimal point always: " + formatting.format(3.0));

        // Setting decimal separator always shown to false
        formatting.setDecimalSeparatorAlwaysShown(false);
        System.out.println("Not show decimal point always: " + formatting.format(3.0));
    }
}
