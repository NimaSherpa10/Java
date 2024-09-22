package Object.QuestionThree;

public class Samsung extends Mobile{
    public Samsung(String IEMICode, String processor,boolean isSingleSIM, String simCard, String number) {
        super(IEMICode, processor, isSingleSIM, simCard, number);
    }

    public void SamsungPay() {
        System.out.println("Paying with samsung phone");
    }
}
