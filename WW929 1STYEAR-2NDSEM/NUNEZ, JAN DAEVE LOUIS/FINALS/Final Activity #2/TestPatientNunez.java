public class TestPatientNunez {
   public static void main (String[] a) {
      PatientNunez defaultPatientValue = new PatientNunez();
      System.out.println("Patient 1: ");
      System.out.println("ID Number: " + defaultPatientValue.getIdNumber());
      System.out.println("Age: " + defaultPatientValue.getAge());
      System.out.println("Blood Type: " + defaultPatientValue.getBloodData().getBloodType());
      System.out.println("Rh Factor: " + defaultPatientValue.getBloodData().getRhFactor() + "\n");
      
      PatientNunez anotherPatientValue = new PatientNunez(123456, 30, "B", '-');
      System.out.println("Patient 2: ");
      System.out.println("ID Number: " + anotherPatientValue.getIdNumber());
      System.out.println("Age: " + anotherPatientValue.getAge());
      System.out.println("Blood Type: " + anotherPatientValue.getBloodData().getBloodType());
      System.out.println("Rh Factor: " + anotherPatientValue.getBloodData().getRhFactor());

   }
}