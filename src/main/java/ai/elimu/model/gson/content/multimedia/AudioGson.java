package ai.elimu.model.gson.content.multimedia;

import ai.elimu.model.enums.content.AudioFormat;
import lombok.Getter;
import lombok.Setter;

public class AudioGson extends MultimediaGson {

    @Getter
    @Setter
    private String transcription;

    @Getter
    @Setter
    private AudioFormat audioFormat;

}
