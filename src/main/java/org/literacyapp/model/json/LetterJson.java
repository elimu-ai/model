package org.literacyapp.model.json;

import org.literacyapp.model.enums.Locale;

public class LetterJson {
    
    private Long id;
    
    private Locale language;
    
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
