import java.util.Scanner;

public class TestAnimalNunez {
   public static void main(String[] args) {
      // Instantiate three Animal objects
      AnimalNunez animal1 = new AnimalNunez();
      AnimalNunez animal2 = new AnimalNunez();
      AnimalNunez animal3 = new AnimalNunez();
      
      // Demonstrate the use of inputAnimalDetails method
      System.out.println("\nEnter details for Animal 1:");
      inputAnimalDetails(animal1);
      System.out.println("\nEnter details for Animal 2:");
      inputAnimalDetails(animal2);
      System.out.println("\nEnter details for Animal 3:");
      inputAnimalDetails(animal3);
      
      // Display Animal information
      System.out.println("\nAnimal 1:");
      animal1.displayAnimalInfo();
      
      System.out.println("\nAnimal 2:");
      animal2.displayAnimalInfo();
      
      System.out.println("\nAnimal 3:");
      animal3.displayAnimalInfo();
   }
   
   // Method to input values from the keyboard for Animal object
   public static void inputAnimalDetails(AnimalNunez animal) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter ID: ");
      animal.setId(scanner.nextInt());
      scanner.nextLine(); // Consume newline
      
      System.out.print("Enter name: ");
      animal.setName(scanner.nextLine());
      
      System.out.print("Enter date of birth: ");
      animal.setDateOfBirth(scanner.nextLine());
      
      System.out.print("Enter animal type: ");
      animal.setAnimalType(scanner.nextLine());
   }
}