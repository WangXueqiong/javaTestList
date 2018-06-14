package testThread;


import java.util.concurrent.CountDownLatch;

/**
 * 同时执行一个并发，过程如下：
 *          e--------->
 * begin ->             f
 *          a->b->c-d->
 * @Description: TODO
 * @param
 * @return
 * @throws
 * @author pengbin <pengbin>
 * 2018/6/14 16:26
 */
public class createThread {
    public static void main(String [] args) {
        //countDownLatch计数2个
        CountDownLatch countDownLatch = new CountDownLatch(2);

        Runnable myRunnable1 = new Runnable(){
            @Override
            public void run() {
                synchronized(this){
                    System.out.println("a");
                    System.out.println("b");
                    System.out.println("c");
                    System.out.println("d");

                    //countDownLatch计数-1
                    countDownLatch.countDown();
                }
            }
        };

        Runnable myRunnable2 = new Runnable(){
            @Override
            public void run() {
                synchronized(this){
                    System.out.println("e");

                    //countDownLatch计数-1
                    countDownLatch.countDown();
                }
            }
        };



        createThread my = new createThread();
        Thread thread1 = new Thread(myRunnable1);
        thread1.start();

        Thread thread2 = new Thread(myRunnable2);
        thread2.start();


        //方法一：通过阻塞停止，最后执行f
/*
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

        //方法二：通过countdownlatch计数执行
        try {
            //调用await方法阻塞当前线程，等待子线程完成后在继续执行
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("f");
    }
}