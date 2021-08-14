package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.analytics.LearningEventType;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class WordLearningEventGson extends LearningEventGson {
    
    private Long wordId;
    
    private String wordText;
    
    private LearningEventType learningEventType;

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

    public LearningEventType getLearningEventType() {
        return learningEventType;
    }

    public void setLearningEventType(LearningEventType learningEventType) {
        this.learningEventType = learningEventType;
    }
}
