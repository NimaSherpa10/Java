package Object.QuestionThree;

public class NokiaLumia extends Mobile {
    public NokiaLumia(String IEMICode, String processor,boolean isSingleSIM, String simCard, String number) {
        super(IEMICode, processor, isSingleSIM, simCard, number);
    }

    public void Battery() {
        System.out.println("Always 100%");
    }
}
