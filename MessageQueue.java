
public class MessageQueue 
{
	//pentru mesajele QUEUE
		private String text;        	// reprezinta continutul mesajului
		private int destinatar;			// reprezinta destinatarul mesajului Queue aflat in antetul mesajului
		
		//la crearea unui mesaj Queue se initializeaza textul si destinatarul
		public MessageQueue(String text, int destinatar) 
		{  
			this.text = text;							
			this.destinatar = destinatar;
		}

		//metode de preluare a atributelor specifice mesajului
		
		public String getText() 
		{
			return text;
		}

		public int getDest() 
		{
			return destinatar;
		}
		
		//metoda de afisare a mesajului Queue
		public void displayQueue() 
		{
			System.out.println( "Mesajul QUEUE " + text + "  s-a trimis lui  " + destinatar + ".\n");
		}
}
