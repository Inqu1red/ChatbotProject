package chatbot.controller;
import chat.model.Chatbot;
import chat.view.Popup;
import java.util.Scanner;
public class Controller
{
 
	private Chatbot chatbot;
	private Scanner keyboardInput;
	private Popup view;
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
		this.chatbot = new Chatbot("Super smart chatbot");
		this.view = new Popup();
		
	}

	
	
	public void start()
	{

	String userText = view.askQuestion("What would you like to say to chatbot? ");
	

	
	while(!userText.equalsIgnoreCase("Shutdown"))
	{
		
		String chatbotResponse = interactWithChatbot(userText);
		view.displayMessage("You said " + chatbotResponse);
		
		userText = keyboardInput.nextLine();
		
		
	}
	
		keyboardInput.close();
	}
	


	private String interactWithChatbot(String text)
	{
		
		String result = "";
		result = chatbot.processText(text);
		
		
		return result;
		
	}
	
	
	
}
