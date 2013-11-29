
public class CounterRunnable implements Runnable{

	@Override
	public void run() {

		for(int i=1 ; i<=100 ; i++)
		{
			System.out.println("Counter: "+i);
			
			//If we want to wait 0.5 seconds
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
