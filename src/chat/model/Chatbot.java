package chat.model;

public class Chatbot
{
	
	
	private String username;
	private String chatbotName;
	
	public Chatbot(String chatbotName)
	{
		
		this.chatbotName = chatbotName;
		this.username = "";
		
	}
	public String processText(String input)

	{
		
		String output = reversePronounDirection(input);
		
		
		
		return output;
	
	}
	
	
	
	
	private Boolean spookyChecker(String sentence)
	{
		
		Boolean isSpooky = false;
		
		
		
		
		return isSpooky;
	}
	 
	private String spookyResponse()
	 {
		 String Response = "thats pretty spooky!";
		 
		 
		 
		 
		 
		 return Response;
	 }
	
	private Boolean isValidHTMLChecker(String valid)
	 {
		 Boolean isValid = false;
		 
		 
		 return isValid;
	 }
	 
	private String isValidHTMLResponse()
	 {
		 String HTMLResponse = "";
		 
		 
		 
		 return HTMLResponse;
	 }
	 
	private String reversePronounDirection(String input)
	 {
		 String output = input.replace("I " , "You ");
		 output = output.replace(" am "  , " are ");
		 output = output.replace(" you " , " me ");
		 
		 return output;
	 }
	 
	
}
