package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    private MoodAnalyzer moodAnalyzer;

    @Test
    public void givenSadMessage_WhenSad_ShouldReturnSAD() {
        moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_whenHappy_shouldReturnHappy() {
        moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy",mood);

    }
}
