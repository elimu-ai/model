package org.literacyapp.model.json.content;

import org.literacyapp.model.enums.Locale;

public class ContentJson {
    
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