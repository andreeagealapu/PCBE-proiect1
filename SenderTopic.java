
public class SenderTopic implements Runnable
{
	Topic managerTopic;
	
	public SenderTopic(Topic managerTopic) 
	{
		this.managerTopic = managerTopic;
	}
	
	@Override
	public void run() 
	{
		if (managerTopic != null)
			while(true)
			{
				try{
					//construiesc mesajul
					MessageTopic m = new MessageTopic("mesaj " + Math.random(), Utility.getRandomNumber(0, 3), System.currentTimeMillis(), 150);
					managerTopic.send(m);	//public mesajul
					Thread.sleep(1000);

				}catch(Exception e){
					System.out.println(e);
				}
			}
	
	}

}
