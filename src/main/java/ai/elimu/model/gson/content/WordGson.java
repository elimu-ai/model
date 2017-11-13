package ai.elimu.model.gson.content;

import java.util.List;
import ai.elimu.model.enums.content.SpellingConsistency;
import ai.elimu.model.enums.content.WordType;
import lombok.Getter;
import lombok.Setter;

public class WordGson extends ContentGson {

    @Getter
    @Setter
    private String text;
    
    @Deprecated
    @Getter
    @Setter
    private String phonetics; // IPA

    @Getter
    @Setter
    private List<AllophoneGson> allophones;

    @Getter
    @Setter
    private int usageCount; // Based on StoryBook content

    @Getter
    @Setter
    private WordType wordType;

    @Getter
    @Setter
    private SpellingConsistency spellingConsistency;

}
