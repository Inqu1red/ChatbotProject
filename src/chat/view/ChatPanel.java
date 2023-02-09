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
	private JButton groanButton;
	private JButton randomFactButton;
	
	private JButton HTMLButton;
	private JButton reversePronounButton;
	
	private JPanel chatButtonsPanel;
	private JPanel menuPanel;
	private JPanel saveLoadPanel;
	
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	
	public ChatPanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		
		
		this.chatButton = new JButton("Chat!");
		this.saveButton = new JButton("Save chats");
		this.loadButton = new JButton("load chats");
		
		
		this.spookyButton =  new JButton("Spooky");
		this.computerScienceButton =   new JButton("Talk about cs");;
		this.groanButton =   new JButton("Tell a dad joke");;
		this.randomFactButton =   new JButton("Tell a fun fact");;
		
		
		this.HTMLButton =  new JButton("Check for valid HTML");;
		this.reversePronounButton =  new JButton("Reverse pronouns");;
		
		this.chatButtonsPanel = new JPanel(new GridLayout(1, 0));
		this.menuPanel = new JPanel(new GridLayout(1, 0));
		this.saveLoadPanel = new JPanel(new GridLayout(1, 0));
		
		this.chatField = new JTextField ("Type here to chat");
		this.chatArea = new JTextArea();
		this.chatPane = new JScrollPane();
		
		
		
		setupPanel();
		
	}
	
	
	public void setupPanel()
	{
		this.setLayout(layout);
	
		
		
		this.setBackground(new Color (80,200,120));
		
	}
	
	public void setupListeners()
	{
		
	}
	
	
	
	
	
	public void setupLayout()
	{
		
	}
	
	
	
}
