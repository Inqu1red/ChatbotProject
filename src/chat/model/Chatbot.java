package chat.model;
import java.util.ArrayList;
public class Chatbot
{
	
	
	private String username;
	private String chatbotName;
	
	public Chatbot(String chatbotName)
	{
		
		this.chatbotName = chatbotName;
		this.username = "";
		
	}
	public String processText(String input)

	{
		
		String output = reversePronounDirection(input);
		
		if (spookyChecker(input))
		{
			output += "\n" + spookyResponse() + "\n"; 
			
			
		}
		
		return output;
	
	}
	
	
	
	
	private Boolean spookyChecker(String sentence)
	{
		
		Boolean isSpooky = false;
		
		ArrayList<String> spookyThings = new ArrayList<String>();
		
		spookyThings.add("Spiders");
		spookyThings.add("Scarecrows");
		spookyThings.add("Blood");
		spookyThings.add("Horror Movies");
		spookyThings.add("Ghosts");
		spookyThings.add("Mummies");
		spookyThings.add("Werewolves");
		spookyThings.add("Zombies");
		spookyThings.add("Trypophobia");
		spookyThings.add("Halloween");
		
		
		for(String phrase : spookyThings)
		{
			if (sentence.toUpperCase().indexOf( phrase.toUpperCase()) >= 0)
			{
				isSpooky = true;
				
				
			}
			
			
			
		}
		
		return isSpooky;
	}
	 
	private String spookyResponse()
	 {
		 String Response = "";
		 ArrayList<String> spookyResponses = new ArrayList<String>();
		 spookyResponses.add("woah thats spooky!");
		 spookyResponses.add("scary!!!");
		 spookyResponses.add("I love that! Spooky");
		 spookyResponses.add("Creepy dude");
		 spookyResponses.add("Bro that's super creepy");
		 
		 int randomSpot = (int) (Math.random() * spookyResponses.size()  );
		 
		 Response = spookyResponses.get(randomSpot);
		 
		 return Response;
		 
	 }
	
	private Boolean isValidHTMLChecker(String valid)
	 {
		 Boolean isValid = false;
		 
		 
		 return isValid;
	 }
	 
	private String isValidHTMLResponse()
	 {
		 String HTMLResponse = "";
		 
		 
		 
		 return HTMLResponse;
	 }
	 
	private String reversePronounDirection(String input)
	 {
		 String output = input.replace("I " , "You ");
		 output = output.replace(" am "  , " are ");
		 output = output.replace(" you " , " me ");
		 
		 return output;
	 }
	 
	
}
