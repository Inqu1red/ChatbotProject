package chat.controller;

import java.util.Scanner;

import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDateTime;


public class IOController
{

	
	public static String loadTextFromFile(Controller app, String pathAndFileName)
	{
		String contents = "";
		
		
		
		
		
		return contents;
	}
	
	public static void saveTextToFile(Controller app, String path, String textToSave)
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
		
	}
	
	
}
