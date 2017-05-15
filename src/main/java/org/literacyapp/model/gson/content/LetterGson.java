package org.literacyapp.model.gson.content;

public class LetterGson extends ContentGson {
    
    private String text;
    
    private String braille;
    
    private int usageCount; // Based on StoryBook content

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
