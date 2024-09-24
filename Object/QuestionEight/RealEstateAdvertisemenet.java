package Object.QuestionEight;

public class RealEstateAdvertisemenet extends Advertisement {
    private String realEstateType;
    private double size;
    private double price;

    public RealEstateAdvertisemenet(String advertisementID,String realEstateType, double size, double price) {
        super(advertisementID, "This is Real Estate advertisement");
        this.realEstateType = realEstateType;
        this.size = size;
        this.price = price;
    }

    public String getRealEstateType() {
        return realEstateType;
    }


    public double getSize() {
        return size;
    }


    public double getPrice() {
        return price;
    }

  

    public void printAdvertisement() {
        System.out.println("Advertisement ID: " + super.getAdvertisementId());
        System.out.println("Description: " + super.getAddDescription());
        System.out.println("Real Estate Type: " + realEstateType);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price: $" + price);
    }
}
