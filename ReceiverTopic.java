
public class ReceiverTopic implements Runnable 
{

	Topic managerTopic;
	private int tip;
	
	public ReceiverTopic(Topic managerTopic, int tip) 
	{
		this.managerTopic = managerTopic;
		this.tip = tip;
	}
	
	@Override
	public void run() 
	{
		if (managerTopic != null)
		{
			while(true)
			{
				try{
					managerTopic.receive(tip);
					}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
		
	}
}
