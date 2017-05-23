package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.gson.content.LetterGson;

public class LetterLearningEventGson extends LearningEventGson {

    private LetterGson letter;
    
    // TODO: activityType?

    public LetterGson getLetter() {
        return letter;
    }

    public void setLetter(LetterGson letter) {
        this.letter = letter;
    }
}
