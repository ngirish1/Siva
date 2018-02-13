public class OddEvenPrintMain {
 
	boolean odd;
	int count = 1;
	int MAX = 20;
 
	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking odd loop");
 
				while (!odd) {
					try {
						System.out.println("Odd waiting : " );
						wait();
						notify();
						System.out.println("Notified odd :" );
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread :" + count);
				count++;
				odd = false;
				
			}
		}
	}
 
	public void printEven() {
 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking even loop");
 
				while (odd) {
					try {
						System.out.println("Even waiting: " );
						wait();
						System.out.println("Notified even:" );
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even thread :" + count);
				count++;
				odd = true;
				notify();
 
			}
		}
	}
 
	public static void main(String[] args) throws InterruptedException {
 
		OddEvenPrintMain oep = new OddEvenPrintMain();
		oep.odd = false;
		Thread t1 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				oep.printEven();
 
			}
		});
		Thread t2 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				oep.printOdd();
 
			}
		});
 
		
 
		/*try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		t1.start();
		//t1.join();
		//t2.join();
		t2.start();
		
 
	}
}