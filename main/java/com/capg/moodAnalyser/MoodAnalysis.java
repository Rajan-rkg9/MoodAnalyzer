package com.capg.moodAnalyser;

public class MoodAnalysis {
	String message;
	
	public String checkMood(String message)
	{
		if(message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
