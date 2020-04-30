package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    private MoodAnalyzer moodAnalyzer;

    @Test
    public void givenSadMessage_WhenSad_ShouldReturnSAD() {
        moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeSadMood("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_whenHappy_shouldReturnHappy() {
        moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeHappyMood("I am in any mood");
        Assert.assertEquals("Happy",mood);

    }
}
