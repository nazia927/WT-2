public class Main implements Runnable {
	
	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
			if(i%10==0) 
			{
				System.out.println();
			}
			try
			{
				Thread.sleep(1000); //for delay
	        } catch (Exception e) 
			{
	            e.printStackTrace();
	        }
			
		}
		
	}

	public static void main(String[] args) {
		Main obj1 = new Main();
		Thread thread = new Thread(obj1);
		thread.start();

	}

}