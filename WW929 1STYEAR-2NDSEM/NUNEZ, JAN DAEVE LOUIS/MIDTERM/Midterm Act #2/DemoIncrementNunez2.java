import java.util.Scanner;

   public class DemoIncrementNunez2 {
      
      public static void main(String[] args)
      {  
         int w = 17, x = 17, y = 18;
         int v = 4;
         int plusPlusV = ++v;
         v = 4;
         int vPlusPlus = v++;
         
         boolean compare1 = (++w == y);
         boolean compare2 = (x++ == y);
         
         System.out.println("v is " + v);
         System.out.println("++v is " + plusPlusV);
         System.out.println("v++ is " + vPlusPlus);
         System.out.println("First compare is " + compare1);
         System.out.println("Second compare is " + compare2);
         
      }
}
     