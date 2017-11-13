package ai.elimu.model.gson.content;

import java.util.List;
import ai.elimu.model.enums.GradeLevel;
import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.content.multimedia.AudioGson;
import ai.elimu.model.gson.content.multimedia.ImageGson;
import lombok.Getter;
import lombok.Setter;

public class StoryBookPageGson extends BaseEntityGson {

    @Getter
    @Setter
    private ImageGson image;

    @Getter
    @Setter
    private List<WordGson> words;

    @Getter
    @Setter
    private AudioGson audio;

}
