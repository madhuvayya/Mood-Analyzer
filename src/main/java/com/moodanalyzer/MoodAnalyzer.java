package com.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message=message;
    }

    public String analyzeMood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return  "HAPPY";
        }catch (NullPointerException ne) {
            ne.printStackTrace();
        }
        return "HAPPY";
    }
}
