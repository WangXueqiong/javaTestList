package testThread;

public class buyTicket implements Runnable{
	 
    private int ticket = 100;  //5张票
 
    @Override
    public  void run() {
        while(ticket >= 1){
            synchronized(this){
                if(ticket>=1){
                    System.out.println(Thread.currentThread().getName()+"正在售卖第"+ticket+"张票");
                    ticket--;   
                }else{
                    System.out.println(Thread.currentThread().getName()+"退出售票");
                    break;
                }
            }
        }
    }
     
    public static void main(String [] args) {
        buyTicket my = new buyTicket();
        new Thread(my, "1号窗口").start();
        new Thread(my, "2号窗口").start();
        new Thread(my, "3号窗口").start();
        new Thread(my, "4号窗口").start();
    }
}