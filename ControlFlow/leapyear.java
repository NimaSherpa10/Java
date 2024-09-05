

public class leapyear {
    public static void main(String[] args) {
        int year1= 2000;
        int year2 = 1900;
        leapYear(year2);
        leapYear(year1);
    }
    public static void leapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("the given year is leap year");
        }
        else{
        System.out.println("the given year is not leap year");
        }
    }
}
