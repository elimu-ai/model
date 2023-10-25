package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class WordAssessmentEventGson extends AssessmentEventGson {
    
    private Long wordId;
    
    private String wordText;
    
    private Float masteryScore;

    private Long timeSpentMs;

    public Long getWordId() {
        return wordId;
    }

    public void setWordId(Long wordId) {
        this.wordId = wordId;
    }

    public String getWordText() {
        return wordText;
    }

    public void setWordText(String wordText) {
        this.wordText = wordText;
    }

    public Float getMasteryScore() {
        return masteryScore;
    }

    public void setMasteryScore(Float masteryScore) {
        this.masteryScore = masteryScore;
    }

    public Long getTimeSpentMs() {
        return timeSpentMs;
    }

    public void setTimeSpentMs(Long timeSpentMs) {
        this.timeSpentMs = timeSpentMs;
    }
}
