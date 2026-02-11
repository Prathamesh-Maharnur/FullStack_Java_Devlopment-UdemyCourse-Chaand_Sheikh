package S7_Core_concepts.StringFormatting;

import java.util.Locale;
import java.util.Calendar;

class StringFormattingMain{
    public static void main(String args[]){
        long n = 461012;
        System.out.format("%d%n",n);
        System.out.printf("The number =  %09d%n", n);
        System.out.printf("The number = %+7d%n", n);
        System.out.printf("The number = %+7d%n", -n);
        System.out.printf("The number = %+,9d%n%n", -n);

        double pie = Math.PI;
        System.out.printf("%f%n", pie);
        System.out.printf("%.3f%n", pie);
        System.out.printf("%10.3f%n", pie);
        System.out.printf("%+010.4f%n", pie);
        System.out.printf("%10.3f%n", pie);
        System.out.printf("%-10.3f%n", pie);
        System.out.format(Locale.FRANCE, "%-10.4f%n%n", pie);

        Calendar c = Calendar.getInstance();
        System.out.printf("Today's date: %te %tb %ty%n",c, c, c);
        System.out.printf("Today's date: %te %tm %ty%n",c, c, c);
        System.out.printf("Today's date: %td %tB %tY%n", c, c, c);
        System.out.printf("Current time: %tl: %tM %tp%n", c, c, c);
        System.out.printf("Date Format: %tD%n", c);

        double dblTotal = 1011111.2525525255;
        int intValue = 25;
        String strValue = "studyeasyorg";
        System.out.format("Total value : $%,.2f%n", dblTotal);
        System.out.printf("Total value: $%10.2f%n", dblTotal);
        System.out.printf("%4d%n", intValue);
        System.out.printf("%20.10s\n", strValue);
        String s = "Hello World!!!";
        System.out.printf("The String object %s is at hash code %h%n%n", s, s);

        String grandTotal = String.format(" GrandTotal: %,.2f%n", dblTotal);
        System.out.println(grandTotal);
    }
}