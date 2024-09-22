package Object.QuestionThree;

public class iPhone extends Mobile {
    public iPhone(String IEMICode, String processor,boolean isSingleSIM, String simCard, String number) {
        super(IEMICode, processor, isSingleSIM, simCard, number);
    }

    public void heySiri(){
        System.out.println("This is siri, how can i help?");
    }
}
