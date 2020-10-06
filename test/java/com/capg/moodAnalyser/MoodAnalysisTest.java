package com.capg.moodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


public class MoodAnalysisTest {

	static MoodAnalysis moodObj = null;
	 @BeforeClass
	 public  static void setUp() {
		 moodObj = new MoodAnalysis();
	 }
	@Test
	public void givenProper_ShouldReturn_Happy() {
		assertEquals("Improper Message", "HAPPY", moodObj.checkMood("I am in Any Mood"));
	}
	
	@Test
	public void givenImProper_ShouldReturn_Sad() {
		assertEquals("Proper Message", "SAD", moodObj.checkMood("I am in Sad Mood"));
	}
	
}
