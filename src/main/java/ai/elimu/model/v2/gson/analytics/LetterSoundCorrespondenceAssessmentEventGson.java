package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class LetterSoundCorrespondenceAssessmentEventGson extends AssessmentEventGson {
    
    private Long letterSoundCorrespondenceId;
    
    private Float masteryScore;

    private Long timeSpentMs;

    public Long getLetterSoundCorrespondenceId() {
        return letterSoundCorrespondenceId;
    }

    public void setLetterSoundCorrespondenceId(Long letterSoundCorrespondenceId) {
        this.letterSoundCorrespondenceId = letterSoundCorrespondenceId;
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
