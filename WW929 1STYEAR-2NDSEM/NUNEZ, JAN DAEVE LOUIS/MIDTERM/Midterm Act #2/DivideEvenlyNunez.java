import java.util.Scanner;

   public class DivideEvenlyNunez {
      public static void main(String[] args)
       {
         final int LIMIT =100;
         int var;
         
         System.out.print(LIMIT + " is evenly divisble by:  \n");
         System.out.println("\n");
         
         for(var = 1; var <= LIMIT; ++var)
            if(LIMIT % var == 0)
               System.out.print(var + " ");
               System.out.println();
        }
        
}             