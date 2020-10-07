package com.capg.moodAnalyser;

public class MoodAnalysisException extends Exception {
	enum ExceptionType {
		ENTERED_NULL , ENTETRED_EMPTY
	}
	ExceptionType type;
	
	public MoodAnalysisException(ExceptionType type , String message) {
		super(message);
		this.type = type;
	}
	
}
