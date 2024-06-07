public class PatientNunez {
   private int idNumber;
   private int age;
   private BloodDataNunez bloodDataNunez;
   
   public PatientNunez() {
      this.idNumber = 0;
      this.age = 0;
      this.bloodDataNunez = new BloodDataNunez();
   }
   
   public PatientNunez(int idNumber, int age, String bloodType, char rhFactor) {
      this.idNumber = idNumber;
      this.age = age;
      this.bloodDataNunez = new BloodDataNunez(bloodType, rhFactor);
   }
   
   public int getIdNumber() {
      return idNumber;
   }
   
   public int getAge() {
      return age;
   }
   
   public BloodDataNunez getBloodData() {
      return bloodDataNunez;
   }
}