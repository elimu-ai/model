package ai.elimu.model.gson.content;

import ai.elimu.model.enums.GradeLevel;
import ai.elimu.model.gson.content.multimedia.ImageGson;
import lombok.Getter;
import lombok.Setter;

public class StoryBookGson extends ContentGson {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private ImageGson coverImage;

    @Getter
    @Setter
    private GradeLevel gradeLevel;
    
    // TODO: add pages

}
