package com.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message=message;
    }

    public String analyzeMood() {
        String returnMessage;
        if (message.contains("Sad"))
            returnMessage="SAD";
        else
            returnMessage= "Happy";
        return returnMessage;
    }
}
