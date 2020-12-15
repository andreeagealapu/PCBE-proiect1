
public class MessageTopic
{

	//pentru mesajele TOPIC
		private String text;
		public long postTime;			//momentul la care a fost postat mesajul
		private long availability;		//valabilitatea mesajului
		private int tip;				//tipul mesajului
		
		
		//la crearea unui mesaj Queue se initializeaza textul,tipul,postTime,valabilitatea
		public MessageTopic(String text, int tip, long postTime, long availability) 
		{
			this.text = text;
			this.tip = tip;
			this.postTime = postTime;
			this.availability = availability;
		}
		
		public String getText() 
		{
			return text;
		}
		
		public long getAvailability() 
		{
			return availability;
		}

		public int getTip() 
		{
			return tip;
		}
		
		//metoda de afisare a mesajului Topic
		public void displayTopic() 
		{
			System.out.println( "Mesajul TOPIC " + text + " de tipul " + tip + " cu valabilitate " + availability + "ms a fost publicat la " + postTime + "ms.\n");
		}
}
