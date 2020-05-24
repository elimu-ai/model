package ai.elimu.model.v2.gson.content;

import ai.elimu.model.enums.content.ImageFormat;
import java.util.Set;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class ImageGson extends ContentGson {
    
    private String title;
    
    private ImageFormat imageFormat;
    
    private byte[] bytes;
    
    private String downloadUrl;
    
    private Integer downloadSize;
    
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

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public Set<WordGson> getWords() {
        return words;
    }

    public void setWords(Set<WordGson> words) {
        this.words = words;
    }
}
