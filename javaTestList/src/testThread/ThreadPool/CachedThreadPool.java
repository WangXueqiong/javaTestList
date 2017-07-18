package testThread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by PB on 2017/7/18.
 */

/**
 * 缓存线程池(newCachedThreadPool)，可以创建任意个线程，每个任务过来后都会创建一个线程，用于任务少，或执行时间短的任
 * 务，例如我们创建十个任务，那么缓冲线程池将会创建十个线程来执行。
 */
public class CachedThreadPool {
    public static  void main(String[] args){
        ExecutorService threadPool = Executors.newCachedThreadPool();

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
