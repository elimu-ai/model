package org.literacyapp.model.json;

import org.literacyapp.model.enums.ImageType;

public class ImageJson {
    
    private Long id;
    
    private String title;
    
    private ImageType imageType;
    
    private int[] dominantColor; // RGB array

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

    public int[] getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(int[] dominantColor) {
        this.dominantColor = dominantColor;
    }
}
