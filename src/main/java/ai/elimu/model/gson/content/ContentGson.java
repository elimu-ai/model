package ai.elimu.model.gson.content;

import java.util.Calendar;
import ai.elimu.model.enums.Locale;
import ai.elimu.model.enums.content.ContentStatus;
import ai.elimu.model.gson.BaseEntityGson;
import lombok.Getter;
import lombok.Setter;

public abstract class ContentGson extends BaseEntityGson {

    @Getter
    @Setter
    private Locale locale;

    @Getter
    @Setter
    private Calendar timeLastUpdate;

    @Getter
    @Setter
    private Integer revisionNumber; // [1, 2, 3, ...]

    @Getter
    @Setter
    private ContentStatus contentStatus;

}
