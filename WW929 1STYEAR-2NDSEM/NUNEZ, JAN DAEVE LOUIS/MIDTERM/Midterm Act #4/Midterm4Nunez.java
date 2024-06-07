import java.util.Scanner;

public class Midterm4Nunez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Character methods");
            System.out.println("2. String methods");
            System.out.println("3. StringBuilder methods");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    characterMethods();
                    break;
                case 2:
                    stringMethods();
                    break;
                case 3:
                    stringBuilderMethods();
                    break;
                case 4:
                    System.out.println("Exiting program, good bye and thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
    }

    public static void characterMethods() {
        char ch = 'A';
        System.out.println("Character methods demonstration:");
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(ch));
        System.out.println("toUpperCase('a'): " + Character.toUpperCase('a'));
        System.out.println("isLowerCase('a'): " + Character.isLowerCase('a'));
        System.out.println("toLowerCase('A'): " + Character.toLowerCase('A'));
        System.out.println("isDigit('5'): " + Character.isDigit('5'));
        System.out.println("isLetter('A'): " + Character.isLetter('A'));
        System.out.println("isLetterOrDigit('*'): " + Character.isLetterOrDigit('*'));
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(' '));
    }
    
    public static void stringMethods() {
        String myName = "Jan";
        String myOtherName = "Daeve"; 
        System.out.println("myName.equals(myOtherName) = " + myName.equals(myOtherName));
        System.out.println("myOtherName.equals(myName) = " + myOtherName.equals(myName));
        System.out.println("myName.length() = " + myName.length());
        System.out.println("myOtherName.length() = " + myOtherName.length());
        System.out.println("myName.compareTo(myOtherName) = " +myName.compareTo(myOtherName));
        System.out.println("myOtherName.compareTo(myName) = " + myOtherName.compareTo(myName));  
    }
    
    public static void stringBuilderMethods() {
        StringBuilder sb = new StringBuilder("Jan Daeve");  
        System.out.println("\nStringBuilder methods demonstration:");
        sb.append(" is");
        System.out.println("append(\"Jandaeve\", \" is\"): " + sb);
        sb.insert(5, " Jandib");
        System.out.println("insert(\"Jan Daeve is\", 5, \" Jandib\"): " + sb);
        System.out.println("capacity(\"Jan Daeve is Jandib\"): " + sb.capacity());
        sb.setLength(4);
        System.out.println("setLength(\"Jan Daeve is Jandib\", 4): " + sb);
        sb.setCharAt(0, 'P');
        System.out.println("setCharAt(\"Jan Daeve is Jandib\", 0, 'P'): " + sb);
    }
}