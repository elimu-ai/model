package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.content.LetterGson;

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
