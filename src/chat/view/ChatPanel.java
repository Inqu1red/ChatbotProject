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
		this.layout = layout;
		
		
		this.chatButton = chatButton;
		this.saveButton = saveButton;
		this.loadButton = loadButton;
		
		
		this.spookyButton = spookyButton;
		this.computerScienceButton = computerScienceButton;
		this.groanButton = groanButton;
		this.randomFactButton = randomFactButton;
		
		
		this.HTMLButton = HTMLButton;
		this.reversePronounButton = reversePronounButton;
		
		this.chatButtonsPanel = chatButtonsPanel;
		this.menuPanel = menuPanel;
		this.saveLoadPanel = saveLoadPanel;
		
		this.chatField = chatField;
		this.chatArea = chatArea;
		this.chatPane = chatPane;
		
		
		
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
