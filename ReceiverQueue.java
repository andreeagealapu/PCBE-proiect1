public class ReceiverQueue implements Runnable
{	
    Manager manager;
	private int dest;
	
	public ReceiverQueue(Manager manager,int dest)
	{
		this.manager = manager;
		this.dest = dest;
	}
	

	@Override
	public void run() 
	{
		// verific daca resursa este TOPIC sau QUEUE

		if (manager != null)
		{
			while(true)
			{
				try{
						manager.receive(dest);
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		
		}
	}
}


