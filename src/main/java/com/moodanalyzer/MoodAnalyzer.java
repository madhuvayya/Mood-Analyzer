package com.moodanalyzer;

public class MoodAnalyzer {

    public String analyzeSadMood(String message) {
        String sadMessage="I am in sad mood";
        if( sadMessage.equals(message)) {
            return "SAD";
        }
        return " ";
    }


    public String analyzeHappyMood(String message) {
        String sadMessage="I am in any mood";
        if( sadMessage.equals(message)) {
            return "Happy";
        }
        return " ";
    }

}
