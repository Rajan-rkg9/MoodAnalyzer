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


	public String checkMood() throws MoodAnalysisException
	{
		try {
			if(message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTETRED_EMPTY , "Empty  Mood.");	
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL , "Null Mood.");
		}
	}
}
