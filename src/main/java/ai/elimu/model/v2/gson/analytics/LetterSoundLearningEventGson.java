package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class LetterSoundLearningEventGson extends LearningEventGson {
    
    private Long letterSoundId;

    private String[] letterSoundLetterTexts;

    private String[] letterSoundSoundValuesIpa;

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
}
