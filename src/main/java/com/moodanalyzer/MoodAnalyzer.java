package com.moodanalyzer;

public class MoodAnalyzer {

    public String analyzeMood(String message) {
        if( "I am in sad mood".equals(message)) {
            return "SAD";
        }
        return " ";
    }

}
