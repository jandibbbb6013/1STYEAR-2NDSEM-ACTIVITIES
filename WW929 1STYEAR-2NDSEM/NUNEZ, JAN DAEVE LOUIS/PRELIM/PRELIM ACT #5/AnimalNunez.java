import java.util.Scanner;

public class AnimalNunez {

    private int id;
    private String name;
    private String dateOfBirth;
    private String animalType;

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

    public void displayAnimalInfo() {
        System.out.println("Animal ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Animal Type: " + animalType);
        System.out.println();
    }
}

/* 
   Name: Jan Daeve Louis P. Nunez
   Date: February 15, 2024
*/