import java.util.Scanner;

public class AssignVolunteer2 {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);

        System.out.print("What type of donation is this? Enter 1 for clothing, 2 for anything else... ");
        donationType = input.nextInt();

        if (donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        } else {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }

        // Display the assigned volunteer and message
        System.out.println("The volunteer assigned to price this donation is: " + volunteer);
        System.out.println("This is " + message);
    }
}