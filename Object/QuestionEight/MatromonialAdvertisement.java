package Object.QuestionEight;

public class MatromonialAdvertisement  extends Advertisement{
    private String gender;
    private String Age;
    private String Occupation;
    public MatromonialAdvertisement(String advertisementID, String gender, String Age, String Occupation ) {
        super(advertisementID, "This is Matrimonial Advertisement");
        this.gender = gender;
        this.Age  = Age;
        this.Occupation = Occupation;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return Age;
    }

    public String getOccupation() {
        return Occupation;
    }
    public void pritnAdvertisement() {
        System.out.println("Advertisement ID: " + super.getAdvertisementId());
        System.out.println("Description: " + super.getAddDescription());
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + Age);
        System.out.println("Occupation: " + Occupation);
    }
}
