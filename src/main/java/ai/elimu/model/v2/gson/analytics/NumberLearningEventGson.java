package ai.elimu.model.v2.gson.analytics;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class NumberLearningEventGson extends LearningEventGson {
    
    private Long numberId;
    
    private Integer numberValue;

    public Long getNumberId() {
        return numberId;
    }

    public void setNumberId(Long numberId) {
        this.numberId = numberId;
    }

    public Integer getNumberValue() {
        return numberValue;
    }

    public void setValue(Integer numberValue) {
        this.numberValue = numberValue;
    }
}
