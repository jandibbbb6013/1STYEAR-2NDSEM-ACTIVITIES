import java.util.Scanner;

class SemiFinalNumber2Nunez
{
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args)
   {
      int scores[] = new int[5];
      int choice = 0;
       
      do{
         System.out.println("\n____________MENU____________");
         System.out.println("1. Populate array elements");
         System.out.println("2. Print array elements");
         System.out.println("3. Get sum of array elements");
         System.out.println("4. Get the average of array elements");
         System.out.println("5. Get the smallest array elements");
         System.out.println("6. Get the largest element");
         System.out.println("7. Display the even numbers values elements");
         System.out.println("8. Display the odd numbers values elements");
         System.out.println("9. Exit");
         System.out.print("Enter a choice: ");
         choice = scan.nextInt();
         
         switch(choice)
         {
            case 1:
               int a[] = populate(scores);
               break;
            case 2:
               print(scores);
               break;
            case 3:
               int sumOfAllElements = sumOfArrayElements(scores);
               System.out.println("The sum of the array of elements is: " + sumOfAllElements);
               break;
            case 4:
               double avgOfAllElements = avgOfArrayElements(scores);
               System.out.println("The average of the array of elements is: " + avgOfAllElements);
               break;
            case 5:
               int smallestValue = smallest(scores);
               System.out.print("The smallest value in the array of elements is: " + smallestValue);
               break;
            case 6:
               int largestValue = largest(scores);
               System.out.print("The largest value in the array of elements is: " + largestValue);
               break;
            case 7:
               evenNumbers(scores);
               break;
            case 8:
               oddNumbers(scores);
               break;
            case 9:
               System.exit(0);
            default:
               System.out.println("Incorrect choice");
         }
      }while(choice!=9);
      
   }
   public static int[] populate(int num[])
   {
      System.out.print("Enter 5 integers: "); 
      for(int x=0;x<num.length;x++)
         num[x]=scan.nextInt();
         
      return num;
   }
   public static void print(int num[])
   {
       for(int x=0;x<num.length;x++)
         System.out.print(num[x]+ " ");
   }
   
   public static int sumOfArrayElements(int num[])
   {
      int sum = 0;
      for (int i = 0; i < num.length; i++)
      {
         sum += num[i];
      }
      
      return sum;
   }
   
   public static double avgOfArrayElements(int num[])
   {
      double avg = 0.0;
      int sum = 0;
      for (int i = 0; i < num.length; i++)
      {
         sum += num[i];
         avg = (double) sum / num.length;
      }
      return avg;
   }
   
   public static int smallest(int num[])
   {
      int min = num[0];
      for(int i = 0; i < num.length; i++)
      {
         if(num[i]< min)
            min = num[i];
      }
      return min;
   }
   public static int largest(int nums[])
   {
      int max = nums[0];
      for(int i = 0; i < nums.length; i++)
      {
         if(nums[i] > max)
            max = nums[i];
      }
      return max;
   }
   public static void evenNumbers(int num[])
   {
       System.out.print("Even numbers: ");
       for (int i = 0; i < num.length; i++)
       {
           if (num[i] % 2 == 0)
           {
               System.out.print(num[i] + " ");
           }
       }
   }

   public static void oddNumbers(int num[])
   {
      int countOdd = 0;
       System.out.print("\nOdd numbers: ");
       for (int i = 0; i < num.length; i++)
       {
           if (num[i] % 2 != 0)
           {
               System.out.print(num[i] + " ");
               countOdd++;
           }
       }
   }
}

