package ai.elimu.model.gson.content;

import java.util.Calendar;
import ai.elimu.model.enums.Language;
import ai.elimu.model.enums.content.ContentStatus;
import ai.elimu.model.gson.BaseEntityGson;

public abstract class ContentGson extends BaseEntityGson {
    
    private Language language;
    
    private Calendar timeLastUpdate;
    
    private Integer revisionNumber; // [1, 2, 3, ...]
    
    private ContentStatus contentStatus;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
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
