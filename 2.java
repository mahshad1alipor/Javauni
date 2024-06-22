import java.util.Scanner;

public class Example5_2 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first string:");
        String str1 = console.nextLine();
        System.out.print("Enter second string:");
        String str2 = console.nextLine();

        if (str1.compareTo(str2) == 0) {
            System.out.println("The two strings are equal.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("The string str1 < string str2.");
        } else {
            System.out.println("The string str1 > string str2.");
        }
    }
}