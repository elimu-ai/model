package ai.elimu.model.gson.content;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class SyllableGson extends ContentGson {

    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private List<AllophoneGson> allophones;

    @Getter
    @Setter
    private int usageCount; // Based on StoryBook content

}
