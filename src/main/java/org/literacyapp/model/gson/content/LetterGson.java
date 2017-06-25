package org.literacyapp.model.gson.content;

import java.util.List;

public class LetterGson extends ContentGson {
    
    private String text;
    
    private List<AllophoneGson> allophones;
    
    private String braille;
    
    private int usageCount; // Based on StoryBook content (all difficulty levels)

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public List<AllophoneGson> getAllophones() {
        return allophones;
    }

    public void setAllophones(List<AllophoneGson> allophones) {
        this.allophones = allophones;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public String getBraille() {
        return braille;
    }

    public void setBraille(String braille) {
        this.braille = braille;
    }
}
