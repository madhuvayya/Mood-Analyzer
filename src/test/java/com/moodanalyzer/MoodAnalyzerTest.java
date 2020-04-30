package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    private MoodAnalyzer moodAnalyzer;

    @Test
    public void givenSadMessage_WhenSad_ShouldReturnSAD() {
        moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }
}
