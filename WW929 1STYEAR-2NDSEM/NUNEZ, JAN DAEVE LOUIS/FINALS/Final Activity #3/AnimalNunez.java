public class AnimalNunez {

    private int id;
    private String name;
    private String dateOfBirth;
    private String animalType;
    private int raceScore;
    private int scoreCount;
    private int highestScore;
    private int lowestScore;
    private double averageScore;
    private Vaccine vaccine;

    public AnimalNunez() {
    
    }
    
    public class Vaccine {
      private int vaccineNumber;
      private String vaccineDescription;
      private String vaccineMonth;
      private int date;
      private int year;
      
      public Vaccine(int vaccineNumber, String vaccineDescription, String vaccineMonth, int date, int year) {
         this.vaccineNumber = vaccineNumber;
         this.vaccineDescription = vaccineDescription;
         this.vaccineMonth = vaccineMonth;
         this.date = date;
         this.year = year;
      } 
      
      public int getVaccineNumber() {
         return vaccineNumber;
      }
      
      public void setVaccineNumber(int vaccineNumber) {
         this.vaccineNumber = vaccineNumber;
      }
      
      public String getVaccineDescription() {
         return vaccineDescription;
      }
      
      public void setVaccineDescription(String vaccineDescription) {
         this.vaccineDescription = vaccineDescription;
      }
      
      public String getVaccineMonth() {
         return vaccineMonth;
      }
      
      public void setVaccineMonth(String month) {
         this.vaccineMonth = vaccineMonth;
      }
      
      public int getDate() {
         return date;
      }
      
      public void setDate(int date) {
         this.date = date;
      }
      
      public int getYear() {
         return year;
      }
      
      public void setYear(int year) {
         this.year = year;
      }
    }

    public AnimalNunez(int id, String name, String dateOfBirth, String animalType, int vaccineNumber, String vaccineDescription, String vaccineMonth, int date, int year) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.animalType = animalType;
        this.vaccine = new Vaccine(vaccineNumber, vaccineDescription, vaccineMonth, date, year);
    }
    
    public AnimalNunez(int id, String name, String dateOfBirth, String animalType, Vaccine vaccine) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.animalType = animalType;
        this.vaccine = vaccine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    
    public int getRaceScore() {
        return raceScore;
    }
    
    public void setRaceScore(int raceScore) {
        this.raceScore = raceScore;
    }
    
    public int getScoreCount() {
        return scoreCount;
    }

    public void setScoreCount(int scoreCount) {
        this.scoreCount = scoreCount;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public int getLowestScore() {
        return lowestScore;
    }

    public void setLowestScore(int lowestScore) {
        this.lowestScore = lowestScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
    
    public void setVaccine(Vaccine vaccine) {
      this.vaccine = vaccine;
    }

    public void displayAnimalInfo() {
        System.out.println("Animal ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Animal Type: " + animalType);
        System.out.println("Score count: " + scoreCount);
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.printf("Average score: %.2f", averageScore);
        System.out.println();
        System.out.println("Vaccine Class: ");
        System.out.println("Vaccine Number: " + vaccine.getVaccineNumber());
        System.out.println("Vaccine Description: " + vaccine.getVaccineDescription());
        System.out.println("Vaccine Month: " + vaccine.getVaccineMonth());
        System.out.println("Vaccine Date: " + vaccine.getDate());
        System.out.println("Vaccine Year: " + vaccine.getYear());
    }
}
   