package org.studyeasy;

import java.util.Calendar;
import java.util.Locale;

public class TestFormat {

    public static void main(String[] args) {
        long n = 461012;
        System.out.format("%d%n", n); // --> "461012"
        System.out.format("%08d%n", n); // --> "00461012"
        System.out.format("%+8d%n", n); // --> " +461012"
        System.out.format("%,8d%n", n); // --> " 461,012"
        System.out.format("%+,8d%n%n", n); // --> "+461,012"


        double pi = Math.PI;
        System.out.format("%f%n", pi); // --> "3.141593"
        System.out.format("%.3f%n", pi); // --> "3.142"
        System.out.format("%10.3f%n", pi); // --> " 3.142"
        System.out.format("%-10.3f%n", pi); // --> "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // --> "3,1416"
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // --> "May 29, 2006"
        System.out.format("%tl:%tM %tp%n", c, c, c); // --> "2:34 am"
        System.out.format("%tD%n", c); // --> "05/29/06"

        double dblTotal = 1011111.2525525255;
        int intValue = 25;
        String stringVal = "studyeasy";
        System.out.printf("Total is: $%,.2f%n", dblTotal);
        System.out.printf("Total: %-10.2f: ", dblTotal);
        System.out.printf("% 4d", intValue);
        System.out.printf("%20.10s\n", stringVal);
        String s = "Hello World";
        System.out.printf("The String object %s is at hash code %h%n", s, s);


        String grandTotal = String.format("Grand Total: %,.2f", dblTotal);

        System.out.println(grandTotal);
    }
}