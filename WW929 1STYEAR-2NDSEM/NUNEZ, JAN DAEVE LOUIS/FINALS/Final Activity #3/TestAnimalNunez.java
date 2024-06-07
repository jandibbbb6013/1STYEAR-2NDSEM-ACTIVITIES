import java.util.Scanner;

public class TestAnimalNunez {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        AnimalNunez animal = new AnimalNunez();
        

        System.out.println("\nEnter details for the animal:");
        inputAnimalDetails(animal);

        System.out.println("\nAnimal Information:");
        animal.displayAnimalInfo();
        
        
        
    }

    public static void inputAnimalDetails(AnimalNunez animal) {

        System.out.print("Enter ID: ");
        animal.setId(scanner.nextInt());
        scanner.nextLine();
   
        System.out.print("Enter name: ");
        animal.setName(scanner.nextLine());

        System.out.print("Enter date of birth: ");
        animal.setDateOfBirth(scanner.nextLine());

        System.out.print("Enter animal type: ");
        animal.setAnimalType(scanner.nextLine());
        
        

        int score;
        int scoreCount = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        int totalScore = 0;

        do {
            System.out.print("Enter animal race score (enter 999 to finish): ");
            score = scanner.nextInt();
            if (score != 999) {
                if (score >= 0 && score <= 100) {
                    scoreCount++;
                    totalScore += score;
                    if (score > highestScore) {
                        highestScore = score;
                    }
                    if (score < lowestScore) {
                        lowestScore = score;
                    }
                } 
                else {
                    System.out.println("Invalid score. Score must be between 0 and 100.");
                }
            }
        } while (score != 999);

        double averageScore = (double) totalScore / scoreCount;

        animal.setScoreCount(scoreCount);
        animal.setHighestScore(highestScore);
        animal.setLowestScore(lowestScore);
        animal.setAverageScore(averageScore);
        
        System.out.print("Enter vaccine number: ");
        int vaccineNumber = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter vaccine description: ");
        String vaccineDescription = scanner.nextLine();
        
        System.out.print("Enter vaccine month: ");
        String vaccineMonth = scanner.nextLine();
        
        System.out.print("Enter vaccine date: ");
        int vaccineDate = scanner.nextInt();
        
        System.out.print("Enter vaccine year: ");
        int vaccineYear = scanner.nextInt();

        AnimalNunez.Vaccine vaccine = animal.new Vaccine(vaccineNumber, vaccineDescription, vaccineMonth, vaccineDate, vaccineYear);
        animal.setVaccine(vaccine);
        
        scanner.close();
    }
    
    }
