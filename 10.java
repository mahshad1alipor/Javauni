public class Example5_10 {
    public static void main(String[] args) {
        String str = "hello ali";
        int width = 15;

        String s = StringFormatter.leftAdjust(str, width);
        System.out.println("Left justify string is: " + s);

        s = StringFormatter.rightAdjust(str, width);
        System.out.println("Right justify string is: " + s);

        s = StringFormatter.center(str, width);
        System.out.println("Middle justify string is: " + s);
    }
}


public class StringFormatter {
    public static String leftAdjust(String s, int width) {
        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else {
            return space(width - stringLength).insert(0, s).toString();
        }
    }

    public static String rightAdjust(String s, int width) {
        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else {
            return space(width - stringLength).append(s).toString();
        }
    }

    public static String center(String s, int width) {
        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else {
            final int numSpace = width - stringLength;
            final int leftSpace = numSpace / 2;
            final int rightSpace = numSpace - leftSpace;
            return space(leftSpace).append(s).append(space(rightSpace)).toString();
        }
    }

    // Return a StringBuffer full of spaces.
    private static StringBuffer space(int numSpace) {
        if (numSpace <= 0) {
            return new StringBuffer();
        } else {
            StringBuffer space = new StringBuffer();
            for (int i = 0; i < numSpace; i++) {
                space.append(' ');
            }
            return space;
        }
    }
}
