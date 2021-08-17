package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.ImageFormat;
import java.util.Set;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class ImageGson extends ContentGson {
    
    private String title;
    
    private ImageFormat imageFormat;
    
    private String bytesUrl;
    
    private Integer bytesSize;
    
    private Set<WordGson> words;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageFormat getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(ImageFormat imageFormat) {
        this.imageFormat = imageFormat;
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
