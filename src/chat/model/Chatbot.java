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
		if (isValidHTMLChecker(input))
		{
			output += "\n" + isValidHTMLResponse() + "\n";
		}
		else
		{
			output += "\n" + "No HTML here " + "\n";

		}
		if (tellGroanJoke(input))
		{

			output += "\n" + groanJokeResponse() + "\n";
		}
		if (tellRandomFact(input))
		{
			
			
			output += "\n" + funFactList() + "\n";
			
		}
		if (computerScienceChecker(input))
		{
			
			output += "\n" + computerScienceResponse() + "\n"; 
		}

		return output;

	}

	private boolean spookyChecker(String sentence)
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

		for (String phrase : spookyThings)
		{
			if (sentence.toUpperCase().indexOf(phrase.toUpperCase()) >= 0)
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

		int randomSpot = (int) (Math.random() * spookyResponses.size());

		Response = spookyResponses.get(randomSpot);

		return Response;

	}

	private boolean isValidHTMLChecker(String phrase)
	{
		Boolean isValid = true;
		if (!phrase.contains("<") || !phrase.contains(">"))
		{
			
				isValid = false;
			

		}
		else
		{
			int openTagStartIndex = phrase.indexOf("<");
			int openTagEndIndex = phrase.indexOf(">");
			if (openTagStartIndex > openTagEndIndex)
			{
				String keyword = phrase.substring(openTagStartIndex + 1, openTagEndIndex);
				int closeTagStartIndex = phrase.indexOf("</");
				int closeTagEndIndex = phrase.indexOf(">", closeTagStartIndex);
				if (closeTagStartIndex > openTagStartIndex  && closeTagEndIndex > openTagEndIndex)
				{
					String closingKeyword = phrase.substring(closeTagStartIndex + 2, closeTagEndIndex);
					
				}
			}
		}

		
		return isValid;
	}

	private String isValidHTMLResponse()
	{

		String HTMLResponse = "HTML Is Valid";

		return HTMLResponse;
	}

	private String reversePronounDirection(String input)
	{
		String output = input.replace("I ", "You ");
		output = output.replace(" am ", " are ");
		output = output.replace(" you ", " me ");

		return output;
	}

	private boolean tellGroanJoke(String request)
	{
		Boolean wantsJoke = false;

		ArrayList<String> jokeAsk = new ArrayList<String>();
		jokeAsk.add("Tell me a joke");
		jokeAsk.add("Can you tell me a joke?");
		jokeAsk.add("Please tell me a joke");

		for (String joked : jokeAsk)
		{

			if (request.toUpperCase().indexOf(joked.toUpperCase()) >= 0)
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
		jokes.add("A man walks into a bar" + "\n" + "ow that hurt!");
		jokes.add("Wanna hear a really long joke?" + "\n" + "jooooooooooke");
		jokes.add("Whats the secret to a great elevator pitch?" + "\n" + "it works on many levels");
		jokes.add("What does a house wear to a party?" + "\n" + " address");
		jokes.add("Have you heard how popular the cemetary is?" + "\n" + "people are just dying to get in!");
		jokes.add("Kid: I'll call you later!" + "\n" + "later: just call me dad!");
		jokes.add("When does a joke become a dad joke?" + "\n" + "When the punchline become apparent!");
		jokes.add("I'm worried for the calendar..." + "\n" + "Its days are numbered");
		int randomSpot = (int) (Math.random() * jokes.size());

		joke = jokes.get(randomSpot);

		return joke;
	}

	private boolean tellRandomFact(String facts)
	{

		Boolean wantsFact = false;

		ArrayList<String> factAsk = new ArrayList<>();
		factAsk.add("Tell me a fun fact");
		factAsk.add("Can you tell me a fact?");
		factAsk.add("Please tell me a fact");
		
		for (String requested : factAsk)
		{

			if (facts.toUpperCase().indexOf(requested.toUpperCase()) >= 0)
			{
				wantsFact = true;

			}

		}
		return wantsFact;

	}

	private String funFactList()
	{
		String tellFact = "";
		ArrayList<String> facts = new ArrayList<>();
		facts.add("Did you know that dolphins are actually really mean?");
		facts.add("Did you know that a group of crows is called a murder?");
		facts.add("Did you know that orange (the color) was actually named after the fruit?");
		facts.add("Did you know that chinchilla fur is so dense that they can't get wet? "
				+ "If they do, their fur will grow mold");
		facts.add("Did you know that their are more atoms in a cup of water than cups of water in all the oceans?");
		facts.add("Did you know that Strawberries and Rasberries aren't technically berries?");
		facts.add("Did you know that the air in chip bags is there to prevent them from going stale?");
		facts.add("If you drop a penny off the Empire State building and it hits someone, it will not "
				+ "kill them, which is a common misconception ");
		facts.add("It took us longer to go from copper swords to steal swords than it took to go"
				+ " from steal swords to nuclear bombs");
		facts.add("Did you know that 1 in 5,000 atlantic lobsters are born bright blue?");
		
		
		int randomSpot = (int) (Math.random() * facts.size());
		
		tellFact = facts.get(randomSpot);
		return tellFact;
	}

	private boolean computerScienceChecker(String computerFacts)
	{
		Boolean wantsComputerFact = false;
		
		ArrayList<String> computerAsk = new ArrayList<>();
		computerAsk.add("Tell me something about computers");
		computerAsk.add("Can you tell me something about computers?");
		computerAsk.add("What can you tell me about computers?");
		computerAsk.add("Tell me something about computer science");
		computerAsk.add("Can you tell me something interesting about computer science?");
		computerAsk.add("Please tell me something about computers");
		computerAsk.add("Please tell me something about computer science");
		computerAsk.add("Tell me a fact about computers");
		computerAsk.add("Tell me a fact about computer science");
		computerAsk.add("Is there anything interesting about computer science you can tell me?");
		for(String compAsked : computerAsk)
		{
			if (computerFacts.toUpperCase().indexOf(compAsked.toUpperCase()) >= 0)
			{
				wantsComputerFact = true;
			}
		}
		
		return wantsComputerFact;
	}
	
	private String computerScienceResponse()
	{
		String computerFact = "";
		
		ArrayList<String> computerFacts = new ArrayList<>();
			computerFacts.add("A 64 bit number contains 18.4 quintillion possible values!");
			computerFacts.add("The computers that put the first man on the moon only had 4kb of ram! "
					+ "Nowdays, that feels like practically nothing");
			computerFacts.add("The equifax hack that took place a few years ago affected over 40% of the U.S population");
			computerFacts.add("About 90% of the worlds currencty is digital, physical money is slowly getting phased out");
			computerFacts.add("Every month, around 5,000 new computer viruses are developed");
		
			int randomSpot = (int) (Math.random() * computerFacts.size());
			
			computerFact = computerFacts.get(randomSpot);
					
		return computerFact;
	}
}
