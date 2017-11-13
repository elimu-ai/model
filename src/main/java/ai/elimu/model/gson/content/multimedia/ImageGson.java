package ai.elimu.model.gson.content.multimedia;

import ai.elimu.model.enums.content.ImageFormat;
import lombok.Getter;
import lombok.Setter;

public class ImageGson extends MultimediaGson {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private ImageFormat imageFormat;

    @Getter
    @Setter
    private String dominantColor; // Web color, e.g. "#FFF" or "rgb(250,173,188)"

}
