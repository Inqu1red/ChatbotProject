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
		setupLayout();
		
	}
	
	
	public void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(new Color (80,200,120));
		
		saveLoadPanel.add(saveButton);
		saveLoadPanel.add(loadButton);
		
		chatButtonsPanel.add(spookyButton);
		chatButtonsPanel.add(HTMLButton);
		chatButtonsPanel.add(computerScienceButton);
		chatButtonsPanel.add(groanButton);
		chatButtonsPanel.add(reversePronounButton);
		
		
		menuPanel.add(chatField);
		menuPanel.add(chatButtonsPanel);
		menuPanel.add(chatButton);
		menuPanel.add(saveLoadPanel);
		
		chatPane.setViewportView(chatArea);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		chatArea.setEditable(false);
		
		this.add(chatPane);
		this.add(menuPanel);
		
		
	}
	
	public void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, chatPane, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, chatPane, -200, SpringLayout.SOUTH, this);
		
		layout.putConstraint(SpringLayout.WEST, menuPanel, 0, SpringLayout.WEST, chatPane);
		layout.putConstraint(SpringLayout.EAST, menuPanel, 0, SpringLayout.EAST, chatPane);
		layout.putConstraint(SpringLayout.NORTH, menuPanel, 25, SpringLayout.SOUTH, chatPane);
		layout.putConstraint(SpringLayout.SOUTH, menuPanel, -25, SpringLayout.SOUTH, this);
		
		
		
	}
	
	
	public void setupListeners()
	{
		
	}
	
	
	
	
	
	
	
	
}
