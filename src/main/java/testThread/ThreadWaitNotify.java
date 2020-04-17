package testThread;

public class ThreadWaitNotify {

	/**
	 * 线程锁
	 */
	private static Object object = new Object();
	
	public static void main(String[] args) {
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (object) {
				System.out.println("进入线程");
					System.out.println("线程睡眠1s");
					try {
						Thread.sleep(1000);
						System.out.println("线程退出睡眠");
						System.out.println("线程进入等待");
						object.wait();
						System.out.println("线程进入等待test");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}
		};
		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (object) {
				System.out.println("进入线程2");
					try {
						System.out.println("线程取消等待");
						object.notify();
						System.out.println("线程取消等待ok");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}
		};
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		thread1.start();
		thread2.start();
	}
}
