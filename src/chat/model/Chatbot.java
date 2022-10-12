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
		if(isValidHTMLChecker(input))
		{
			output += "\n" + isValidHTMLResponse() + "\n" ;
		}
		else
		{
			output += "\n" + "No HTML here " + "\n";
			
		}
		if (tellGroanJoke(input))
		{
			
			output += "\n" + groanJokeResponse() + "\n";
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
		 if (!valid.contains(" < " ))
		 {
			 isValid = true;
			 
			 return isValid;
			 
		 }
		 else
		 {
			 isValid = false;
		 }
		 
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
	 
	private Boolean tellGroanJoke(String request)
	{
		Boolean wantsJoke = false;
				
		ArrayList<String> jokeAsk = new ArrayList<String>();
		jokeAsk.add("Tell me a joke");
		jokeAsk.add("Can you tell me a joke?");
		jokeAsk.add("Please tell me a joke");
		
		for(String joked : jokeAsk)
		{
			
			if(request.toUpperCase().indexOf( joked.toUpperCase()) >= 0)
			{
				wantsJoke = true;
				
			}
			
		}
		
		
		return wantsJoke;
	}
	
	private String groanJokeResponse()
	{
		String joke = "";
		ArrayList<String> jokes = new ArrayList<String>();
		jokes.add("Why did the chicken cross the road?" + "\n" + "to get to the other side!");
		jokes.add("Wanna hear a really long joke?" + "\n" + "jooooooooooke");
		jokes.add("Whats the secret to a great elevator pitch?" + "\n" + "it works on many levels");
		jokes.add("What does a house wear to a party?" + "/n" + "adress");
		jokes.add("Have you heard how popular the cemetary is?" + "\n" + "people are just dying to get in!");
		jokes.add("Kid: I'll call you later!" + "\n" + "later: just call me dad!");
		jokes.add("When does a joke become a dad joke?" + "\n" + "When the punchline become apparent!");
		
		int randomSpot = (int) (Math.random() * jokes.size() );
		
		joke = jokes.get(randomSpot);
		
		return joke;
	}
	
	private Boolean tellFunFact(String facts)
	{
		
	Boolean wantsFact = false;
			
	ArrayList<String> factAsk = new ArrayList<>();
	factAsk.add("Tell me a fun fact");
	factAsk.add("Can you tell me a fact?");
	factAsk.add("Please tell me a fact");		
	return wantsFact;
		
	}
	
	private boolean computerScienceChecker(String computerFacts)
	{
		Boolean wantsComputerFact = false;
		
		
		return wantsComputerFact;
	}
	
	
	
	
	
}
