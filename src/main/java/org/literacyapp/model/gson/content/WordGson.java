package org.literacyapp.model.gson.content;

public class WordGson extends ContentGson {
    
    private String text;
    
    private String phonetics; // IPA
    
    private int usageCount; // Based on StoryBook content

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(String phonetics) {
        this.phonetics = phonetics;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }
}
