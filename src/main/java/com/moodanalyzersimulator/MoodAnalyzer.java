package com.moodanalyzersimulator;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message=message;
    }

    public String analyzeMood() throws MoodAnalysisException {
        try {
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"enter proper message");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException ne) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"enter proper message");
        }
    }
}
