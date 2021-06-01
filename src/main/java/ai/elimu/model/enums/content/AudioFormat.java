package ai.elimu.model.enums.content;

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
    
    private AudioFormat(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }
}
