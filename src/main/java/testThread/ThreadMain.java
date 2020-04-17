package testThread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO 创建线程的几种方法
		// 一：
		// 1.通过创建继承thread的类ThreadCreate
		ThreadCreate thread = new ThreadCreate();
		thread.start();
		// 2.创建一个Thread的匿名子类
		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("thread2 Running");

			}
		};
		thread2.start();
		// 二：
		// 1.通过创建实现runable的类ThreadCreate
		// 2.实现实现了Runnable接口的匿名类
		Runnable myRunnable = new Runnable() {
			public void run() {
				System.out.println("thread3 running");
			}
		};
		Thread thread3 = new Thread(myRunnable);
		thread3.start();

	}
}
