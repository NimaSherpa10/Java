package practice;

class ThreadJoin extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 2; ++j) {
			try {
				Thread.sleep(3000);
				System.out.println("The Current Thread name is : " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
		}
	}
}
 
public class ThreadJoinExample {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// creating three threads
		ThreadJoin th1 = new ThreadJoin();
		ThreadJoin th2 = new ThreadJoin();
		ThreadJoin th3 = new ThreadJoin();
 
		th1.start();
 
		
		try {
			System.out.println("The Current Thread name is : " + Thread.currentThread().getName());
 
			th1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th2.start();
		try {
			System.out.println("The Current Thread name is : " + Thread.currentThread().getName());
 
			th2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th3.start();
 
	
 
		

    }
}