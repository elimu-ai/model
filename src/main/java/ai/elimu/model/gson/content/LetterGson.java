package ai.elimu.model.gson.content;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class LetterGson extends ContentGson {

    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private List<AllophoneGson> allophones;

    @Getter
    @Setter
    private String braille;

    @Getter
    @Setter
    private int usageCount; // Based on StoryBook content (all difficulty levels)

}
