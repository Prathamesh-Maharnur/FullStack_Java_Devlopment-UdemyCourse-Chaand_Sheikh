public class S2_lct26to34_decisions_with_operators {

       public static void main(String args[]){
           int x = 12;
           int y = 3;
           System.out.println(x+y);

           String x1 = "Prathmesh";
           String x2 = "Maharnur";
           int x3 = 10;
           System.out.println(x1+x2+x3);

           System.out.println(10 + (3 * 8) / 5 % 10 + 2);


           int c = 4;
           int d = c++;
           int e = ++c;
           System.out.println("c="+c+" d="+d+" e="+e);

           int f = 89;
           if (f > 50) {
               System.out.println("Number greater than 50");
           }
           else {
               System.out.println("Number less than 50");
           }

           int g = 89;
           if (g != 50) {
               System.out.println("Number is not 50");
           }
           else {
               System.out.println("Number other than 50");
           }
           System.out.println("Sample Code");

           int num = 65;
           if(num >= 50){
               System.out.println("Number is greater than or equal to 50");
           }
           else{
               System.out.println("Number is less than or equal to 50");
           }

           boolean b1 = true;
           boolean b2 = false;

           if ((b1 && b2) || b1 ^ b2)
           {
               System.out.println("condition is True");
           }
           else
               System.out.println("condition is False");


           int boy_age = 20;
           int girl_age = 21;

           if ((boy_age > 21) && (girl_age > 18))
           {
               System.out.println("Eligible for marriage");
           }
           else
           {
               System.out.println("Wait for it kiddo! ");
           }

           int i = 12;

           String result = (i > 10)? "i is greater than 10": "i is less than 10";
           System.out.println(result);

           int a = 10;
           int b =45;
           int z= 56;

           result = (a>b)? (a>z?"a is greatest":"z is greatest"):  (z>b?"z is greatest":"b is greatest");
           System.out.println(result);


           int var = 4;
           var += 5;
           var -= 5;
           var *= 5;
           var /= 5;
           var %= 5;

           System.out.println(var);

           int h = 4;
           int k = 10;

           if (h == 5){
               System.out.println("h is 5");
           }
           else if(h > 5)
           {
               System.out.println("h is greater than 5");
           }
           else
           {
               System.out.println("h is smaller than 5");
               if( k == 10)
               {
                   System.out.println("k is 10");
               }
           }

       }
}