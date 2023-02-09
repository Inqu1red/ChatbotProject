package chat.view;
import javax.swing.JOptionPane;
	
public class Popup
{
	
	private ChatFrame window;
	
	public Popup(ChatFrame window)
	{
		this.window = window;
		
	}
	
	public void displayMessage(String message)
	{
		
		JOptionPane.showMessageDialog(null, message);
		
		
	}
	
	public String askQuestion(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		
		if (response == null)
		{
			
			response = "";
			
		}
		
		
		
		
		
		return response;
		
		
	}
	
	
}
