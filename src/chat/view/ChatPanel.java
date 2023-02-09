package chat.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

import java.awt.GridLayout;
import java.awt.Color;

import chat.controller.Controller;


public class ChatPanel extends JPanel
{

	private Controller app;
	private SpringLayout layout;
	private JButton chatButton;
	private JButton saveButton;
	private JButton loadButton;
	
	private JButton spookyButton;
	private JButton computerScienceButton;
	private JButton groanJokeButton;
	private JButton randomFactButton;
	
	private JButton HTMLButton;
	
	
	public ChatPanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = layout;
		
		
		this.chatButton = chatButton;
		this.saveButton = saveButton;
		this.loadButton = loadButton;
		
		
		this.spookyButton = spookyButton;
		this.computerScienceButton = computerScienceButton;
		this.groanJokeButton = groanJokeButton;
		this.randomFactButton = randomFactButton;
		
		this.HTMLButton = HTMLButton;
		
		
		setupPanel();
		
	}
	
	
	public void setupPanel()
	{
		
		
		this.setBackground(Color.BLUE);
		
	}
	
	public void setupListeners()
	{
		
	}
	
	
	
	
	
	public void setupLayout()
	{
		
	}
	
	
	
}
