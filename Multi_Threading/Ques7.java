package Multi_Threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ques7 {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<Integer>> runnableList = new ArrayList<>();

        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Future<Integer>> futureList = executorService.invokeAll(runnableList);

        for(Future<Integer> e: futureList){
            if(e.isDone()){
                try {
                    System.out.println("isDone(): " + e.isDone());
                    System.out.println("get(): " + e.get());
                    System.out.println("isCancelled(): " + e.isCancelled() + "\n");
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        }
        executorService.shutdownNow();

    }
}

