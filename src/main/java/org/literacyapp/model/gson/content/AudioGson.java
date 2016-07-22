package org.literacyapp.model.gson.content;

import org.literacyapp.model.enums.Locale;

public class AudioGson {
    
    private Long id;
    
    private Locale locale;
    
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
