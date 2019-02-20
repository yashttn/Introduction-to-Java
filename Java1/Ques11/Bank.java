package Java1.Ques11;

public class Bank {
    int ROI;
    public void getDetails(){
        ROI = 4;
        System.out.println("ROI for Bank is " + ROI);
    }
}

class SBI extends Bank{
    public void getDetails(){
        ROI = 5;
        System.out.println("ROI for SBI is " + ROI);
    }
}

class BOI extends Bank{
    public void getDetails(){
        ROI = 6;
        System.out.println("ROI for BOI is " + ROI);
    }
}
class ICICI extends Bank{
    public void getDetails(){
        ROI = 7;
        System.out.println("ROI for ICICI is " + ROI);
    }
}

