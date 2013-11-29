
public class AlphabetRunnable implements Runnable{

	@Override
	public void run() {
		
		for(char alphabet = 'a'; alphabet <= 'z';alphabet++)
		{
			 System.out.println(alphabet);
			 waitALittleBitPleaseThankYou();//Call this method if we want to wait 0.5 seconds
		}
		
		for(char alphabet = 'A'; alphabet <= 'Z';alphabet++)
		{
			 System.out.println(alphabet);
			 waitALittleBitPleaseThankYou();//Call this method if we want to wait 0.5 seconds
		}
	}
	
	private void waitALittleBitPleaseThankYou()
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
