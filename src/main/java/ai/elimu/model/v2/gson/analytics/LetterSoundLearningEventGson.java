package ai.elimu.model.v2.gson.analytics;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Based on https://github.com/elimu-ai/webapp/blob/main/src/main/java/ai/elimu/entity/analytics/LetterSoundLearningEvent.java
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LetterSoundLearningEventGson extends LearningEventGson {

    /**
     * The sequence of letters. E.g. <code>["s","h"]</code>.
     */
    private List<String> letterSoundLetters;

    /**
     * The sequence of sounds (IPA values). E.g. <code>["ʃ"]</code>.
     */
    private List<String> letterSoundSounds;

    /**
     * This field might not be included, e.g. if the assessment task was done in a 
     * 3rd-party app that did not load the content from the elimu.ai Content Provider. 
     * In that case, this field will be {@code null}.
     */
    private Long letterSoundId;
}
