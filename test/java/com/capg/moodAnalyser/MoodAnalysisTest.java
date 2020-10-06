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
		assertEquals("Improper Message", "HAPPY", moodObj.checkMood());
	}
	
	@Test
	public void givenImProper_ShouldReturn_Sad() {
		MoodAnalysis moodObj = new MoodAnalysis("I am in Sad Mood");
		assertEquals("Proper Message", "SAD", moodObj.checkMood());
	}
	
}
