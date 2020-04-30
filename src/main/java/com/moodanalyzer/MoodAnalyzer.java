package com.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message=message;
    }

    public String analyzeMood() {
        if( message.contains("Sad")) {
            return "SAD";
        }
        return "Happy";
    }
}
