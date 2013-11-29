import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class HelloWorldRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello World!");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HelloWorldRunnable hello = new HelloWorldRunnable();
		
		ExecutorService threadExecutor = Executors.newFixedThreadPool(1);
		
		threadExecutor.execute(hello);
		
		threadExecutor.shutdown();
	}
}
