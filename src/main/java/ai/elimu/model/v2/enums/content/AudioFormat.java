package ai.elimu.model.v2.enums.content;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum AudioFormat {
    
    OGG("audio/ogg"),
    MP3("audio/mpeg"),
    WAV("audio/wave");
    
    /**
     * The MIME type - https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types
     * <p>
     * Example: "audio/mpeg"
     */
    private String contentType;
}
