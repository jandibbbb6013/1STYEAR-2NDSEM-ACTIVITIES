import java.util.Scanner;

public class AssignVolunteer {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        final int clothingCode = 1;
        final int otherCode = 2;
        final String clothingPricer = "Regina";
        final String otherPricer = "Marco";

        Scanner input = new Scanner(System.in);

        System.out.print("What type of donation is this? Enter 1 or 2: ");
        donationType = input.nextInt();

        if (donationType == clothingCode) {
            volunteer = clothingPricer;
        } 
        
        else if (donationType == otherCode) {
            volunteer = otherPricer;
        } 
        
        else {
            System.out.println("Invalid donation type. Please enter 1 or 2.");
            return; // Exit the program if an invalid donation type is entered
        }

        // Display the assigned volunteer
        System.out.println("The volunteer assigned to price this donation is: " + volunteer);
    }
}
