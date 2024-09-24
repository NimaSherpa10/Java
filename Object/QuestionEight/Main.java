package Object.QuestionEight;



public class Main {
    public static void main(String[] args) {
        // Create a Matrimonial Advertisement
        MatromonialAdvertisement matrimonialAd = new MatromonialAdvertisement("M001", "Female", "25", "Software Engineer");
        System.out.println("Matrimonial Advertisement Details:");
        matrimonialAd.pritnAdvertisement(); // Call to print the advertisement
        System.out.println(); // Blank line for readability

        // Create a Real Estate Advertisement
        RealEstateAdvertisemenet realEstateAd = new RealEstateAdvertisemenet("R001", "Apartment", 1200, 250000);
        System.out.println("Real Estate Advertisement Details:");
        realEstateAd.printAdvertisement(); // Call to print the advertisement
    }
}
