package ai.elimu.model.gson.content.multimedia;

import java.util.List;
import java.util.Set;
import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.content.NumeracySkill;
import ai.elimu.model.gson.content.ContentGson;
import ai.elimu.model.gson.content.LetterGson;
import ai.elimu.model.gson.content.NumberGson;
import ai.elimu.model.gson.content.WordGson;
import lombok.Getter;
import lombok.Setter;

public abstract class MultimediaGson extends ContentGson {

    @Getter
    @Setter
    private String downloadUrl; // URL of file to be downloaded

    @Getter
    @Setter
    private Integer downloadSize; // kB

    @Getter
    @Setter
    private String contentType; // MIME type

    @Getter
    @Setter
    private Set<LiteracySkill> literacySkills;

    @Getter
    @Setter
    private Set<NumeracySkill> numeracySkills;

    @Getter
    @Setter
    private List<LetterGson> letters;

    @Getter
    @Setter
    private List<NumberGson> numbers;

    @Getter
    @Setter
    private List<WordGson> words;

}
