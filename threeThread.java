

class startThread extends Thread{
    public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " count =  " + i);
		}
	}
}


public class threeThread extends Thread {
   	public static void main(String[] args) {
		Thread t1 = new startThread();
		Thread t2 = new startThread();
		Thread t3 = new startThread();
		
        t3.run();
        t3.run();

	}
}
