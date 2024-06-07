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

    public AnimalNunez() {
    
    }

    public AnimalNunez(int id, String name, String dateOfBirth, String animalType) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.animalType = animalType;
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

    public void displayAnimalInfo() {
        System.out.println("Animal ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Animal Type: " + animalType);
        System.out.println("Score count: " + scoreCount);
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.printf("Average score: %.2f", averageScore);
    }
}
