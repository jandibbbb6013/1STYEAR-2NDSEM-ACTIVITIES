import java.util.Scanner;

class SemiFinalNumber3Nunez {
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      int rows, cols;
      System.out.print("Enter the rows and columns: ");
      rows = scan.nextInt();
      cols = scan.nextInt();
      double[][] prices = new double[rows][cols];
      int choice = 0;
      
       
      do {
         System.out.println("\n____________MENU____________");
         System.out.println("1. Populate prices");
         System.out.println("2. Print prices");
         System.out.println("3. Get sum of prices");
         System.out.println("4. Get the average of prices");
         System.out.println("5. Get the smallest price");
         System.out.println("6. Get the largest price");
         System.out.println("7. Display the even number prices");
         System.out.println("8. Display the odd number prices");
         System.out.println("9. Exit");
         System.out.print("Enter a choice: ");
         choice = scan.nextInt();
         
         switch(choice) {
            case 1:
               populate(prices, rows, cols);
               break;
            case 2:
               printPrices(prices);
               break;
            case 3:
               sumOfAllPrices(prices);
               break;
            case 4:
               avgOfAllPrices(prices);
               break;
            case 5:
               smallestPrice(prices);
               break;
            case 6:
               largestPrice(prices);
               break;
            case 7:
               evenNumbers(prices);
               break;
            case 8:
               oddNumbers(prices);
               break;
            case 9:
               break;
            default:
               System.out.println("Incorrect choice");
         }
      } while(choice!=9);
      
   }
      
   public static double[][] populate(double[][] prices, int rows, int cols) {
      System.out.print("Enter " + rows + " rows " + "and " + cols + " columns of prices: ");
      for(int x = 0; x < prices.length; x++) {
         for (int y = 0; y < prices[x].length; y++) {
            prices[x][y]= scan.nextDouble();
         }
      }
      return prices;
   }
   public static void printPrices(double[][] prices) {
       for(int x = 0; x < prices.length; x++) {
         for (int y = 0; y < prices[x].length; y++) {
            System.out.print(prices[x][y] + " ");
         }
         System.out.println();
      }
   }
   
   public static void sumOfAllPrices(double[][] prices) {
      double sum = 0;
      for (int x = 0; x < prices.length; x++) {
         for (int y = 0; y < prices[x].length; y++) {
            sum += prices[x][y];
         }
      }
      System.out.printf("The sum of the all prices is: %.2f ", sum);
   }
   
   public static void avgOfAllPrices(double[][] prices) {
      double avg = 0;
      int sum = 0;
      for (int x = 0; x < prices.length; x++) {
         for (int y = 0; y < prices[x].length; y++) {
            sum += prices[x][y];
            avg = (double) sum / prices.length;
         }
      }
      System.out.printf("The average of all prices is: %.2f", avg);
   }
   
   public static void smallestPrice(double[][] prices) {
      double min = prices[0][0];
      for(int x = 0; x < prices.length; x++) {
            for (int y = 0; y < prices[x].length; y++) {
               if(prices[x][y]< min)
                  min = prices[x][y];
            }
      }
      System.out.println("The smallest price is: " + min);
   }
   public static void largestPrice(double[][] prices) {
      double max = prices[0][0];
      for(int x = 0; x < prices.length; x++) {
            for (int y = 0; y < prices[x].length; y++) {
               if(prices[x][y] > max)
                  max = prices[x][y];
            }
      }
      System.out.println("The largest price is: " + max);
   }
   public static void evenNumbers(double[][] prices) {
       System.out.print("Even numbers: ");
       for (int x = 0; x < prices.length; x++) {
          for (int y = 0; y < prices[x].length; y++) {
             if (prices[x][y] % 2 == 0) {
               System.out.print(prices[x][y] + " ");
             }
          } 
       }
   }

   public static void oddNumbers(double[][] prices) {
      System.out.print("\nOdd numbers: ");
       for (int x = 0; x < prices.length; x++) {
         for (int y = 0; y < prices[x].length; y++) {
            if (prices[x][y] % 2 != 0) {
               System.out.print(prices[x][y] + " ");
            }
         }
       }
   }
}

