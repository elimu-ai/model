package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class LetterSoundAssessmentEventGson extends AssessmentEventGson {
    
    private Long letterSoundId;
    
    private Float masteryScore;

    private Long timeSpentMs;

    public Long getLetterSoundId() {
        return letterSoundId;
    }

    public void setLetterSoundId(Long letterSoundId) {
        this.letterSoundId = letterSoundId;
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
