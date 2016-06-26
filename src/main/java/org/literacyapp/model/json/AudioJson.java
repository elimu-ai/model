package org.literacyapp.model.json;

import org.literacyapp.model.enums.Locale;

public class AudioJson {
    
    private Long id;
    
    private Locale language;
    
    private String title;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
