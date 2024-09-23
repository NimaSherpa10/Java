package Object.QuestionFive;



public class Fare {
    private String origin;
    private String Destination;
    public double fare;

    public Fare(String origin, String Destination, double fare) {
        this.origin = origin;
        this.Destination = Destination;
        this.fare = fare;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        this.Destination = destination;
    }

    public double getFare() {
        CalculateFare();
        return fare;
    }
    
     public void CalculateFare() {
        // Example: A simple fare calculation based on the distance (for demonstration)
        // You can replace this with actual logic based on specific requirements.
        if (origin.equalsIgnoreCase("City A") && Destination.equalsIgnoreCase("City B")) {
            fare = 100.0;  // Example fare between City A and City B
        } else if (origin.equalsIgnoreCase("City A") && Destination.equalsIgnoreCase("City C")) {
            fare = 150.0;  // Example fare between City A and City C
        } else {
            fare = 200.0;  // Default fare for any other route
        }
    }

    public void PrintFare() {
        System.out.println("Fare from " + getOrigin() + " to " + getDestination() + " is: $" + getFare());
    }
}

