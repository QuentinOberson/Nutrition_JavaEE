import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[10];
		
		ArrayWriterRunnable writer1 = new ArrayWriterRunnable(1, array);
		ArrayWriterRunnable writer2 = new ArrayWriterRunnable(7, array);
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		pool.execute(writer1);
		pool.execute(writer2);
		
		pool.shutdown();
	}

}
