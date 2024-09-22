package Object.QuestionThree;

public class Mobile implements IMobile, ITelephone {
    private String IEMICode;
    private String processor;
    private boolean isSingleSIM;
    private String simCard;
    private String number;

    public Mobile(String IEMICode, String processor,boolean isSingleSIM, String simCard, String number) {
        this.IEMICode = IEMICode;
        this.processor = processor;
        this.simCard = simCard;
        this.number = number;
        this.isSingleSIM = isSingleSIM;
    }

    public String getNumber(){
        return number;
    }

    public String getSimCard() {
        return simCard;
    }

    public void Dial() {
        System.out.println("Dialing " + getNumber() + "...");
    }
    public void connectBluetooth() {
        System.out.println("Bluetooth connected.");
    }

    public String getIEMICode() {
        return IEMICode;
    }

    public String getProcessor(){
        return processor;
    }
    public boolean isSingleSIM() {
        return isSingleSIM;
    }

    public void getWIFIConnection() {
        System.out.println("Connected to Wi-Fi.");
    }
   public void receive(){
        System.out.println("Receiving a call...");
   }
   public void sendMessage(String mobileNo, String message) {
    System.out.println("Sending message to " + mobileNo + ": " + message);
   }

}
