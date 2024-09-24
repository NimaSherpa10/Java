package Object.QuesitonSeven;

import java.util.Date;

public class NonFinancialPetition extends Petition {
    private String citizenName;
    private Date implementationDate;

    // Constructor for NonFinancialPetition
    public NonFinancialPetition(int petitionId, String name, Date dateRegistered, String location, 
                                String city, String problemDescription, String status, String citizenName, 
                                Date implementationDate) {
        super(petitionId, name, dateRegistered, location, city, problemDescription, status);
        this.citizenName = citizenName;
        this.implementationDate = implementationDate;
    }

    // Getters and Setters for citizenName and implementationDate
    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public Date getImplementationDate() {
        return implementationDate;
    }

    public void setImplementationDate(Date implementationDate) {
        this.implementationDate = implementationDate;
    }

    // Override to include citizen name and implementation date in details
    @Override
    public void displayPetitionDetails() {
        super.displayPetitionDetails();
        System.out.println("Citizen Name: " + citizenName);
        System.out.println("Implementation Date: " + implementationDate);
    }
}