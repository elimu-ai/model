package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.gson.content.NumberGson;

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
