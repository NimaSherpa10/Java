package FoodDonationApp.src.models;

public class Donor extends User{
        private String companyName;
        public Donor(String email, String password, String firstName, String lastName, String phoneNumber, String location, String companyName) {
            super(email, password, firstName, lastName, phoneNumber, location);
            this.companyName = companyName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public String toString() {
            return "Donor Info  {" +
                    "companyName='" + companyName + '\'' +
                    ", " + super.toString() +
                    '}';
        }
}
