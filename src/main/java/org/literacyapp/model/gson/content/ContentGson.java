package org.literacyapp.model.gson.content;

import java.util.Calendar;
import org.literacyapp.model.enums.Locale;
import org.literacyapp.model.enums.content.ContentStatus;

public abstract class ContentGson {
    
    private Long id;
    
    private Locale locale;
    
    private Calendar timeLastUpdate;
    
    private Integer revisionNumber; // [1, 2, 3, ...]
    
    private ContentStatus contentStatus;
    
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

    public ContentStatus getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(ContentStatus contentStatus) {
        this.contentStatus = contentStatus;
    }
}
