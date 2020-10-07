package com.capg.moodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


public class MoodAnalysisTest {

//	static MoodAnalysis moodObj = null;
//	 @BeforeClass
//	 public  static void setUp() {
//		 moodObj = new MoodAnalysis();
//	 }
	@Test
	public void givenProper_ShouldReturn_Happy() {
		MoodAnalysis moodObj = new MoodAnalysis("I am in Any Mood");
		try {
			moodObj.checkMood();
		}
		catch (Exception e) {
			assertEquals("HAPPY", e.getMessage());
		}
	}
	
	@Test
	public void givenImProper_ShouldReturn_Sad() {
		MoodAnalysis moodObj = new MoodAnalysis("I am in Sad Mood");
		try {
			moodObj.checkMood();
		}
		catch (Exception e) {
			assertEquals("SAD" , e.getMessage());
		}
	}
	
	@Test
	public void givenNullMood_ShouldThrow_CustomException() {
		MoodAnalysis moodObj = new MoodAnalysis(null);
		try {
			moodObj.checkMood();
		}
		catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL , e.type);
		}
	}
		
	@Test
	public void givenEmptyMood_ShouldThrow_CustomException() {
		MoodAnalysis moodObj = new MoodAnalysis("");
		try {
			moodObj.checkMood();
		}
		catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTETRED_EMPTY , e.type);
		}
	}
	
}
