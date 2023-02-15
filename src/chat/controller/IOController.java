package chat.controller;

import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

import java.time.LocalDateTime;


public class IOController
{

	
	public static String loadTextFromFile(Controller app, String pathAndFileName)
	{
		String contents = "";
		File source = new File(pathAndFileName);
		try (Scanner textScanner = new Scanner(source))
		{
			
			while (textScanner.hasNextLine())
			{
				contents += textScanner.nextLine() + "\n";
			}
				
			
		}
		
		catch (FileNotFoundException error)
		{
			app.handleError(error);
			contents += "No text to load";
		}
		
		
		return contents;
	}
	
	
	public static String buildFileName(String path)
	{
		String fileName = path;
		
		LocalDateTime current = LocalDateTime.now(); //gets the local time at the time its used, factory method that gets information for me that is more secure
		
		fileName += current.getDayOfMonth() + " " + current.getMonth();
		
		int minuteTime = current.getMinute();
		
		String minutes = "0";
		
		if (minuteTime < 10)
		{
			minutes += minuteTime;
		}
		else 
		{
			minutes = " " + minuteTime;
		}
		
		
		fileName += " " + current.getHour() + "-" + minutes ;
		fileName += ".txt";
		
		
		
		return fileName;
	}
	
	
	public static void saveTextToFile(Controller app, String path, String textToSave)
	{
		
		String fileName = buildFileName(path);
		
		try (Scanner textScanner = new Scanner(textToSave);
				PrintWriter textWriter = new PrintWriter(fileName))
		{
		while (textScanner.hasNextLine())
		{
			String line = textScanner.nextLine();
			textWriter.println(line);
			
		}
		
		}
		
		catch (IOException error)
		{
			app.handleError(error);
			
		}
		
	}
	
}
