package ai.elimu.model.gson.content.multimedia;

import ai.elimu.model.enums.content.VideoFormat;

public class VideoGson extends MultimediaGson {

    private String title;
    
    private VideoFormat videoFormat;
    
    private String thumbnailDownloadUrl;

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

    public String getThumbnailDownloadUrl() {
        return thumbnailDownloadUrl;
    }

    public void setThumbnailDownloadUrl(String thumbnailDownloadUrl) {
        this.thumbnailDownloadUrl = thumbnailDownloadUrl;
    }
}
