package ai.elimu.model.v2.gson.content;

import ai.elimu.model.enums.content.AudioFormat;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class AudioGson extends ContentGson {
    
    private String title;
    
    private String transcription;
    
    private AudioFormat audioFormat;
    
    private String bytesUrl;
    
    private Integer bytesSize;
    
    private Long durationMs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
    }

    public String getBytesUrl() {
        return bytesUrl;
    }

    public void setBytesUrl(String bytesUrl) {
        this.bytesUrl = bytesUrl;
    }

    public Integer getBytesSize() {
        return bytesSize;
    }

    public void setBytesSize(Integer bytesSize) {
        this.bytesSize = bytesSize;
    }
    
    public Long getDurationMs() {
        return durationMs;
    }
    
    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }
}
