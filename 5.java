public class Example5_5 
{
    public static void main(String [] args)
    {
        StringBuffer str = new StringBuffer("Hello");
        System.out.println("str before calling the method :" + str);
        testMethod(str) ;
        System.out.println("str after calling the method :" + str);
    }

    //****************
    public static void testMethod(StringBuffer pStr)
    {
        System.out.println("In method : pStr " + "before changing its value: " + pStr);
        pStr.append(" Sunny Day");
        System.out.println("In method : pStr " + "after changing its value: " + pStr);
    }
}