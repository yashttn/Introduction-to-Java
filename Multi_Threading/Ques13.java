package Multi_Threading;

public class Ques13 {

    public void worker1(){
        synchronized (this) {
            System.out.println("Worker 1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 1 Done");
        }
    }

    public void worker2(){
        synchronized (this) {
            System.out.println("Worker 2 Started");
            System.out.println("Worker 2 Done");
            notify();
        }
    }

    public static void main(String[] args) {
        Ques13 demo = new Ques13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker2();
            }
        }).start();
    }
}
