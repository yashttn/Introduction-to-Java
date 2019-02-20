package Java1.Ques11;

public class Main extends Bank{

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getDetails();

        Bank sbi = new SBI();
        sbi.getDetails();

        Bank boi = new BOI();
        boi.getDetails();

        Bank icici = new ICICI();
        icici.getDetails();

    }
}
