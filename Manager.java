import java.util.Queue;
import java.util.LinkedList;

//cu ajutorul acestei clase gestionam adaugarea si stergerea mesajelor MessageQueueQueue din coada


public class Manager 
{

    Queue<MessageQueue> q = new LinkedList<MessageQueue>();
    private int queueMaxSize = 10;	                    //dimensiunea maxima a cozii

   public  void receive(int dest) throws InterruptedException 
   {
        while (true) 
        {
            synchronized(this)
            {
                while (q.isEmpty()) 
                {	                //pentru stergere/primirea mesajului, asteptam cat timp coada e goala 
                    wait();
                }
                
                if(q.peek().getDest() == dest)
                {         //programul trebuie sa fie destinatar al mesajului pt a-l receptiona
                    
                    MessageQueue m = q.poll();	            //extrag mesajul din coada si apoi il sterg, deoarece a fost citit/primit
                    m.displayQueue();	            //mesajul a fost trimis

                    System.out.println("Mesajul QUEUE " + m.getText() + " a fost citit de catre " + m.getDest()+ " si apoi a fost sters.\n");
                    	
                }

                notifyAll();
            }
        }
    }

	synchronized void send(MessageQueue MessageQueue) throws InterruptedException 
	{

        while (q.size() == queueMaxSize) 
        {	            //astept cat timp coada e plina
            wait();
        }

        q.add(MessageQueue);                             	//adaug mesajul in coada
        notify();
    }
}
