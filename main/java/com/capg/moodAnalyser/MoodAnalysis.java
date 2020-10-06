package com.capg.moodAnalyser;

public class MoodAnalysis {
	String message;
	
	
	public MoodAnalysis() {
		super();
	}


	public MoodAnalysis(String message) {
		super();
		this.message = message;
	}


	public String checkMood()
	{
		try {
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
