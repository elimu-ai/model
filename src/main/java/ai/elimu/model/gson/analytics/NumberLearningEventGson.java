package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.content.NumberGson;

public class NumberLearningEventGson extends LearningEventGson {

    private NumberGson number;
    
    // TODO: activityType?

    public NumberGson getNumber() {
        return number;
    }

    public void setNumber(NumberGson number) {
        this.number = number;
    }
}
