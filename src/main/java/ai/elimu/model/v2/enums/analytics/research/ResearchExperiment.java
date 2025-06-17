package ai.elimu.model.v2.enums.analytics.research;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResearchExperiment {
    
    EXP_0_WORD_EMOJIS("Displaying emojis next to words makes it easier to learn the meaning of words."),
    EXP_1_LETTER_COLORS("Using different colors for consonants and vowels makes reading easier.");

    /**
     * The experiment theory; Why will the idea improve learning outcome?
     */
    private final String theory;
}
