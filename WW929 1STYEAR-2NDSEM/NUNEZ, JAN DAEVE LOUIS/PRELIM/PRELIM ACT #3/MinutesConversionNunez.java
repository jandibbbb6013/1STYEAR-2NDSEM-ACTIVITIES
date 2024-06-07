
import javax.swing.JOptionPane;

public class MinutesConversionNunez {

   public static void main (String[] args) {
              
      int minutes, hours, hourValueConversion = 60, dayValueConversion = 1440;
      double days;
         
      minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minutes:"));
      
      hours = minutes / hourValueConversion;
      days = (double) minutes / dayValueConversion;
      
      System.out.printf("%d minutes equals %d hours and equals %.3f days.", minutes, hours, days);
      
   }
}

/*
Name: Jan Daeve Louis P. Nuñez
Date: February 06, 2024
*/