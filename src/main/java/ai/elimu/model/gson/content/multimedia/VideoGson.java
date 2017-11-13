package ai.elimu.model.gson.content.multimedia;

import ai.elimu.model.enums.content.VideoFormat;
import lombok.Getter;
import lombok.Setter;

public class VideoGson extends MultimediaGson {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private VideoFormat videoFormat;

    @Getter
    @Setter
    private String thumbnailDownloadUrl;

}
