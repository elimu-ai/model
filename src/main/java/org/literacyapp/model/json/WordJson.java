package org.literacyapp.model.json;

import org.literacyapp.model.enums.Language;

public class WordJson {
    
    private Long id;
    
    private Language language;
    
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}