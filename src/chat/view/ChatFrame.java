package chat.view;

import chat.controller.Controller;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	
	private Controller app;
	private ChatPanel panel;
	public ChatFrame(Controller app)
	{
		super();
		
		this.panel = new ChatPanel(this.app);
		
		
		this.app = app;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Chatbot GUI");
		this.setSize(1024, 768);
		this.setResizable(false);
		
		
		this.setVisible(true);
	}
	
	
	
	
	
}
