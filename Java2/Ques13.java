package Java2;

public class Ques13{
    public static void main(String[] args) {
        try {
            throw new MyException("Threw Custom MyException");
        }
        catch (MyException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Caught Custom MyException");
        }
    }
}

class MyException extends Exception{
    public MyException(String s) {
        super(s);
    }
}