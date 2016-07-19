package org.literacyapp.model.json.content;

import org.literacyapp.model.enums.content.ImageType;

public class ImageJson {
    
    private Long id;
    
    private String title;
    
    private ImageType imageType;
    
    private String dominantColor; // Web color

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageType getImageType() {
        return imageType;
    }

    public void setImageType(ImageType imageType) {
        this.imageType = imageType;
    }

    public String getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(String dominantColor) {
        this.dominantColor = dominantColor;
    }
}
