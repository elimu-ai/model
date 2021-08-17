package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.analytics.LearningEventType;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class LetterLearningEventGson extends LearningEventGson {
    
    private Long letterId;
    
    private String letterText;
    
    private LearningEventType learningEventType;

    public Long getLetterId() {
        return letterId;
    }

    public void setLetterId(Long letterId) {
        this.letterId = letterId;
    }

    public String getLetterText() {
        return letterText;
    }

    public void setLetterText(String letterText) {
        this.letterText = letterText;
    }

    public LearningEventType getLearningEventType() {
        return learningEventType;
    }

    public void setLearningEventType(LearningEventType learningEventType) {
        this.learningEventType = learningEventType;
    }
}
