package testThread.productAndCousume;

public class Consumer extends Thread{
	 private int neednum;                //生产产品的数量
     private Godown godown;            //仓库

     
     public int getNeednum() {
		return neednum;
	}


	public void setNeednum(int neednum) {
		this.neednum = neednum;
	}


	public Godown getGodown() {
		return godown;
	}


	public void setGodown(Godown godown) {
		this.godown = godown;
	}

	
	

	public Consumer(int neednum, Godown godown) {
		super();
		this.neednum = neednum;
		this.godown = godown;
	}


	public void run() {
             //消费指定数量的产品
             godown.consume(neednum); 
     }
     
}
