package Object.QuesitonSeven;
import java.util.Date;

public class Petition {
    private int petitionId;
    private String name;
    private Date dateRegistered;
    private String location;
    private String city;
    private String problemDescription;
    private String status;

    // Constructor to initialize the Petition class
    public Petition(int petitionId, String name, Date dateRegistered, String location, 
                    String city, String problemDescription, String status) {
        this.petitionId = petitionId;
        this.name = name;
        this.dateRegistered = dateRegistered;
        this.location = location;
        this.city = city;
        this.problemDescription = problemDescription;
        this.status = status;
    }

    // Getter and Setter methods
    public int getPetitionId() {
        return petitionId;
    }

    public void setPetitionId(int petitionId) {
        this.petitionId = petitionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to display petition details
    public void displayPetitionDetails() {
        System.out.println("Petition ID: " + petitionId);
        System.out.println("Name: " + name);
        System.out.println("Date Registered: " + dateRegistered);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("Problem Description: " + problemDescription);
        System.out.println("Status: " + status);
    }
}