package org.literacyapp.model.json;

import org.literacyapp.model.enums.Language;

public class Audio {
    
    private Long id;
    
    private Language language;
    
    private String title;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
