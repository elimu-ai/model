package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.VideoFormat;
import java.util.Set;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class VideoGson extends ContentGson {
    
    private String title;
    
    private VideoFormat videoFormat;
    
    private String bytesUrl;
    
    private Integer bytesSize;
    
    private Set<WordGson> words;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(VideoFormat videoFormat) {
        this.videoFormat = videoFormat;
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

    public Set<WordGson> getWords() {
        return words;
    }

    public void setWords(Set<WordGson> words) {
        this.words = words;
    }
}
