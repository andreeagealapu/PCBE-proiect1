import java.lang.Math;

public class SenderQueue implements Runnable{
	
	Manager manager;
	private int no_of_receivers;

	public SenderQueue(Manager manager,int no_of_receivers) {
		this.manager = manager;
		this.no_of_receivers=no_of_receivers;
	}
	
	
	@Override
	public void run() 
	{	
		if (manager != null) 
		{
			while(true)
			{
				try{
					MessageQueue m = new MessageQueue("mesaj " + Math.random(), Utility.getRandomNumber(0, no_of_receivers)); //construiesc mesajul
					manager.send(m);  //public mesajul
					Thread.sleep(1000);

				}catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}
}
	
