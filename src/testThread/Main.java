package testThread;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.startThread();
		main.notifyThread();
	}

	/**
	 * 线程锁
	 */
	private final Object object = new Object();

	/**
	 * 启动线程
	 */
	public void startThread() {
		System.out.println("1");
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("开始执行线程。。。");
				synchronized (object) {
					try {
						System.out.println("进入睡眠状态。。。");
						Thread.sleep(2000);
						System.out.println("退出睡眠状态。。。");
						System.out.println("进入等待状态。。。");
						object.wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("线程结束。。。");

				}

			}
		});
		System.out.println("2");
		t.start();
	}

	public void notifyThread() {
		System.out.println("3");
		synchronized (object) {
			System.out.println("4");
			object.notify();
			System.out.println("退出等待状态。。。");
		}
		System.out.println("5");
	}
}
