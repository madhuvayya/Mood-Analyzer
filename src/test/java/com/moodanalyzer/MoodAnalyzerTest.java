package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    private MoodAnalyzer moodAnalyzer;

    @Test
    public void givenMessage_WhenSad_ShouldReturnSAD() throws MoodAnalysisException {
        moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnInvalidMessage() throws MoodAnalysisException {
        moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException mae){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,mae.type);
        }
    }

    @Test
    public void givenMessage_WhenEmpty_ShouldReturnEmptyMessage() throws MoodAnalysisException {
        moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException mae){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, mae.type);
        }
    }
}
