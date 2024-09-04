package utils;

public class Uilities {
    public static double percentToAmount(double price, double percent) {
        return ((percent / 100) * price);
    }
    public static String stripDecimalPoints(double stripAmount) {
        return String.format("%.2f" , stripAmount);
    }
}
