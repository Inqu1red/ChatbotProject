package chatbot.controller;
import chat.model.Chatbot;
import java.util.Scanner;
public class Controller
{
 
	private Chatbot chatbot;
	private Scanner keyboardInput;
	
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
		this.chatbot = new Chatbot();
		
	}

	
	
	public void start()
	{
	
	
		keyboardInput.close();
	}
	



	
	
	
}
