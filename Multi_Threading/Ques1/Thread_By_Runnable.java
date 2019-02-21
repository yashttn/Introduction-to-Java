package Multi_Threading.Ques1;

public class Thread_By_Runnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Running Runnable Thread");
    }

    public static void main(String[] args) {
        new Thread(new Thread_By_Runnable()).start();
    }
}
