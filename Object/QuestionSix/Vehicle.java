package Object.QuestionSix;

public abstract class Vehicle {
   private String RegNumber;

   public Vehicle(String RegNumber) {
        this.RegNumber = RegNumber;
   }

   public String getRegNumber() {
    return RegNumber;
   }

   public abstract int getNumberOfWheels();

   public boolean equals(String regNumber) {
        if(regNumber.equals(getRegNumber())) {
            return true;
        }
        return false;
   }
}
