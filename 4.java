public class Example5_4 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("str before calling the method: " + str);
        testMethod(str);
        System.out.println("str after calling the method: " + str);
    }

    public static void testMethod(String pStr) {
        System.out.println("In method: pStr before changing its value: " + pStr);
        pStr = "sunny Day";
        System.out.println("In method: pStr after changing its value: " + pStr);
    }
}