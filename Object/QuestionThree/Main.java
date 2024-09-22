package Object.QuestionThree;

public class Main {
    public static void main(String[] args) {
        // Create instances of each phone type
        Samsung samsung = new Samsung("123456789", "Exynos", true, "SIM1", "9876543210");
        NokiaLumia nokiaLumia = new NokiaLumia("987654321", "Snapdragon", false, "SIM2", "0123456789");
        iPhone iphone = new iPhone("111122223333", "A14 Bionic", true, "SIM1", "5555555555");

        // Test Samsung
        System.out.println("Samsung:");
        samsung.Dial();
        samsung.connectBluetooth();
        samsung.SamsungPay();

        // Test Nokia Lumia
        System.out.println("\nNokia Lumia:");
        nokiaLumia.Dial();
        nokiaLumia.connectBluetooth();
        nokiaLumia.Battery();

        // Test iPhone
        System.out.println("\niPhone:");
        iphone.Dial();
        iphone.connectBluetooth();
        iphone.heySiri();
    }
}
