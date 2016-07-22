package org.literacyapp.model.gson.content;

import java.util.Calendar;
import org.literacyapp.model.enums.Locale;

public abstract class ContentGson {
    
    private Long id;
    
    private Locale locale;
    
    private Calendar timeLastUpdate;
    
    private Integer revisionNumber; // [1, 2, 3, ...]
    
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
