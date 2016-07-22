package org.literacyapp.model.gson.content;

import java.util.Calendar;
import org.literacyapp.model.enums.Locale;

public class ContentGson {
    
    private Locale locale;
    
    private Calendar timeLastUpdate;
    
    private Integer revisionNumber; // [1, 2, 3, ...]

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Calendar getTimeLastUpdate() {
        return timeLastUpdate;
    }

    public void setTimeLastUpdate(Calendar timeLastUpdate) {
        this.timeLastUpdate = timeLastUpdate;
    }

    public Integer getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(Integer revisionNumber) {
        this.revisionNumber = revisionNumber;
    }
}
