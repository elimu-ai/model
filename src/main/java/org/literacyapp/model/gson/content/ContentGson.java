package org.literacyapp.model.gson.content;

import org.literacyapp.model.enums.Locale;

public class ContentGson {
    
    private Locale locale;
    
    // TODO: Calendar timeLastUpdate
    
    // TODO: Integer revisionNumber

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
