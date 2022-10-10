package chatbot.controller;
import chat.model.Chatbot;
import chat.view.Popup;
import java.util.ArrayList;
public class Controller
{
 
	private Chatbot chatbot;
	public ArrayList<String> spookyThings;
	private Popup view;
	public Controller()
	{
		
		this.chatbot = new Chatbot("Super smart chatbot");
		this.view = new Popup();
		this.spookyThings = new ArrayList<String>();
		
	}

	
	
	public void start()
	{
	
	spookyThings.add("Spiders");
	spookyThings.add("Scarecrows");
	spookyThings.add("Blood");
	spookyThings.add("Horror Movies");
	spookyThings.add("Ghosts");
	spookyThings.add("Mummies");
	spookyThings.add("Werewolves");
	spookyThings.add("Zombies");
	spookyThings.add("Trypophobia");
	String userText = view.askQuestion("What would you like to say to chatbot? ");
	

	
	while(!userText.equalsIgnoreCase("Shutdown"))
	{
		
		String chatbotResponse = interactWithChatbot(userText);
		userText = view.askQuestion("Chatbot says: " + chatbotResponse);
		
		
		
		
	}
	
	view.displayMessage("Goodbye!");
		
	}
	


	private String interactWithChatbot(String text)
	{
		
		String result = "";
		result = chatbot.processText(text);
		
		
		return result;
		
	}
	
	
	
}
