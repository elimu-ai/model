package org.literacyapp.model.gson.content.multimedia;

import org.literacyapp.model.enums.content.ImageFormat;

public class ImageGson extends MultimediaGson {
    
    private String title;
    
    private ImageFormat imageFormat;
    
    private String dominantColor; // Web color, e.g. "#FFF" or "rgb(250,173,188)"

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

    public String getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(String dominantColor) {
        this.dominantColor = dominantColor;
    }
}
