import java.util.Scanner;

public class SandwichNunez {
   
   private String mainIngredient;
   private String breadType;
   private double price;
      
   // Getter and setter for main ingredient
   public String getMainIngredient() {
   
      return mainIngredient;
      
   }
   
   public void setMainIngredient(String mainIngredient) {
   
      this.mainIngredient = mainIngredient;
      
   }
   
   // Getter and settter for bread type
   public String getBreadType() {
   
      return breadType;
      
   }
   
   public void setBreadType(String breadType) {
   
         this.breadType = breadType;
         
   }
   
   // Getter and setter methods for price
   public double getPrice() {
   
      return price;
      
   }
   
   public void setPrice(double price) {
   
      this.price = price;
      
   }
   
   // Method to input values from the user
   public void inputSandwichDetails1() {
   
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("\nSandwich 1");
      
      System.out.print("Enter main ingredient: ");
      this.mainIngredient = scanner.nextLine();
      
      System.out.print("Enter bread type: ");
      this.breadType = scanner.nextLine();
      
      System.out.print("Enter price: ");
      this.price = scanner.nextDouble();
      
   }
   
   public void inputSandwichDetails2() {
   
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("\nSandwich 2");
      
      System.out.print("Enter main ingredient: ");
      this.mainIngredient = scanner.nextLine();
      
      System.out.print("Enter bread type: ");
      this.breadType = scanner.nextLine();
      
      System.out.print("Enter price: ");
      this.price = scanner.nextDouble();
      
   }
   
   public void inputSandwichDetails3() {
   
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("\nSandwich 3");
      
      System.out.print("Enter main ingredient: ");
      this.mainIngredient = scanner.nextLine();
      
      System.out.print("Enter bread type: ");
      this.breadType = scanner.nextLine();
      
      System.out.print("Enter price: ");
      this.price = scanner.nextDouble();
      
   }
   
   public void display() {
   
      System.out.println("Main Ingredient: " + mainIngredient);
      System.out.println("Bread Type: " + breadType);
      System.out.println("Price: $" + price);
      
   }
   
}

/* 
   Name: Jan Daeve Louis P. Nunez
   Date: February 13, 2024
*/