package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class LetterSoundAssessmentEventGson extends AssessmentEventGson {
    
    private Long letterSoundId;

    private String[] letterSoundLetterTexts;

    private String[] letterSoundSoundValuesIpa;
    
    private Float masteryScore;

    private Long timeSpentMs;

    public Long getLetterSoundId() {
        return letterSoundId;
    }

    public void setLetterSoundId(Long letterSoundId) {
        this.letterSoundId = letterSoundId;
    }

    public String[] getLetterSoundLetterTexts() {
        return letterSoundLetterTexts;
    }

    public void setLetterSoundLetterTexts(String[] letterSoundLetterTexts) {
        this.letterSoundLetterTexts = letterSoundLetterTexts;
    }

    public String[] getLetterSoundSoundValuesIpa() {
        return letterSoundSoundValuesIpa;
    }

    public void setLetterSoundSoundValuesIpa(String[] letterSoundSoundValuesIpa) {
        this.letterSoundSoundValuesIpa = letterSoundSoundValuesIpa;
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
