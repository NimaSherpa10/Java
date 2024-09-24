package Object.QuestionEight;

public class Advertisement {
    private String advertisementId;
    private String addDescription;

    public Advertisement(String advertisementID, String addDescription) {
        this.advertisementId = advertisementID;
        this.addDescription = addDescription;
    }

    public String getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(String advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getAddDescription() {
        return addDescription;
    }

    public void setAddDescription(String addDescription) {
        this.addDescription = addDescription;
    }
}
