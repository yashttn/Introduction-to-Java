package Multi_Threading.Ques1;

public class Thread_By_Extend extends Thread {
    @Override
    public void run() {
        System.out.println("Running Thread by extending Thread Class");
    }

    public static void main(String[] args) {
        new Thread_By_Extend().start();
    }
}
