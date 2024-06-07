public class TestBloodDataNunez {
   public static void main (String[] a) {
      BloodDataNunez defaultValueBloodData = new BloodDataNunez();
      System.out.println("Default Value Blood Type: ");
      System.out.println("Blood Type: " + defaultValueBloodData.getBloodType());
      System.out.println("Rh Factor: " + defaultValueBloodData.getRhFactor() + "\n");
      
      BloodDataNunez anotherValueBloodData = new BloodDataNunez("AB", '-');
      System.out.println("Another Value Blood Type: ");
      System.out.println("Blood Type: " + anotherValueBloodData.getBloodType());
      System.out.println("Rh Factor: " + anotherValueBloodData.getRhFactor());
   }  
}