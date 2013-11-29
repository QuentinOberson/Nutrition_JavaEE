import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CounterRunnable counter = new CounterRunnable();
		AlphabetRunnable alpha = new AlphabetRunnable();
		
		ExecutorService pool = Executors.newFixedThreadPool(1);
		//Put 1 if we want to execute one after another
		
		pool.execute(counter);
		pool.execute(alpha);
		
		pool.shutdown();
		
	}
}
