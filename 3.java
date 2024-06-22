public class Example5_3 {
    public static void main(String[] args) {
        String str = "Computer science is a dynamic science.";
        String substr = "science";
        int count; 
        count = countSpace(str);
        System.out.println("String is: " + str);
        System.out.println("Number of blanks is: " + count);
        count = substringCount(str, substr);
        System.out.println("***");
        System.out.println("String is: " + str);
        System.out.println("subString is: " + substr);
        System.out.println("subString iterates " + count + " times in str.");
    }

    public static int countSpace(String s) {
        int count = 0;
        // look for the first 
        int index = s.indexOf(' ');
        // indexOf returns -1 on failure.
        while (index >= 0) {
            count++;
            index = s.indexOf(' ', index + 1);
        }
        return count;
    }

    // *****************
    public static int substringCount(String s, String subString) {
        int count = 0;
        // look for the first 
        int index = s.indexOf(subString);
        // indexOf returns -1 on failure.
        while (index >= 0) {
            count++;
            // look for the next just after the last one
            index = s.indexOf(subString, index + 1);
        }
        return count;
    }
}