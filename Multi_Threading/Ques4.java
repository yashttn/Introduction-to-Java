package Multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1.1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    }catch (InterruptedException e){
                        System.out.println("Thread 1.2 Interrupted!");
                    }
                    System.out.println("Thread 1.2");
                }
            });
        } finally {
            executorService.shutdown();
        }
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());

        System.out.println("--------------------");

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        try {
            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2.1");
                }
            });

            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    }catch (InterruptedException e){
                        System.out.println("Thread 2.2 Interrupted!");
                    }
                    System.out.println("Thread 2.2");
                }
            });
        } finally {
            executorService1.shutdownNow();
        }
        System.out.println(executorService1.isShutdown());
        System.out.println(executorService1.isTerminated());

    }
}
