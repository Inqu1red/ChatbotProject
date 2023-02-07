package chat.controller;
import chat.model.Chatbot;

import chat.view.*;
import chat.view.ChatFrame;

import java.util.ArrayList;
public class Controller
{
 
	private Chatbot chatbot;
	private ChatFrame window;
	
	private Popup view;
	public Controller()
	{
		
		this.chatbot = new Chatbot("Super smart chatbot");
		this.view = new Popup();
		this.window = new ChatFrame(this);
		
	}

	
	
	public void start()
	{
	
	
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
