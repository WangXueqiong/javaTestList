package testThread.ThreadPool;

/**
 * Created by PB on 2017/7/18.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 固定数量线程池（newFixedThreadPool）允许我们创建固定线程数量的线程池，
 * 如果任务数大于线程池中线程的数量，那么任务将等待.
 */
public class FixedThreadPool {
    public static  void  main(String[] args){
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for(int i=1; i<=10; i++){
            final int taskId = i;
            threadPool.execute(new Runnable(){

                public void run() {
                    for(int i=1; i<=10; i++){
                        System.out.println(Thread.currentThread().getName() + " is looping of " + i + " the task is " + taskId);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }

                    }
                }

            });
        }
        System.out.println("add  all of 10 task");
        threadPool.shutdown();
    }
}
