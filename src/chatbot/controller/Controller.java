package chatbot.controller;
import chat.model.Chatbot;
import java.util.Scanner;
import chat.vew.Popup;
public class Controller
{
 
	private Chatbot chatbot;
	private Scanner keyboardInput;
	
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
		this.chatbot = new Chatbot("Super smart chatbot");
		
	}

	
	
	public void start()
	{
	
	System.out.println("What do you want to say to the chatbot?");
	
	String userText = keyboardInput.nextLine();
	

	
	while(!userText.equalsIgnoreCase("Shutdown"))
	{
		
		String chatbotResponse = interactWithChatbot(userText);
		System.out.println("Chatbot Says: ");
		System.out.println(chatbotResponse);
		
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
