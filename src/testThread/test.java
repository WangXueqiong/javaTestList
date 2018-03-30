package testThread;

public class test{
	
	public static void main(String[] args){
		
		for(int i = 1;i<99;i++){
			System.out.println(i);
			Thread t = new Thread();
			try {
				t.sleep(0);
				//System.out.println("休眠0.5s");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
