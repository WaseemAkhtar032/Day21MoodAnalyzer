package analyzemood;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Happy") || message.contains("Any"))
            return "Happy";
        else
            return "Sad";
    }

    public String checkMood(String mood) {
        if (mood.equals("Happy"))
            return "Happy";
        else
            return "Sad";
    }
    public static String invalidMoodAnalyser(String message) throws MoodAnalyzerException {
        if (message == null)
        {
            try
            {
                throw new MoodAnalyzerException();
            }
            catch (MoodAnalyzerException exception)
            {
                return "Happy";
            }
        }
        return "Sad";
    }
}
