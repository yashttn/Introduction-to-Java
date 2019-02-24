package Java2.Ques9;

public class Ques9 {
    public static void main(String[] args) {

        Woods woods1=new Woods("Table",7000,true, false);
        Woods woods2=new Woods("Chair",3000,true, true);
        woods1.getDetails();
        woods1.doFireTest();
        woods1.doStressTest();
        woods2.getDetails();
        woods2.doFireTest();
        woods2.doStressTest();


        Metals metals1=new Metals("Table",5000,true, false);
        Metals metals2=new Metals("Chair",2000,false, false);
        metals1.getDetails();
        metals1.doFireTest();
        metals1.doStressTest();
        metals2.getDetails();
        metals2.doFireTest();
        metals2.doStressTest();
    }
}