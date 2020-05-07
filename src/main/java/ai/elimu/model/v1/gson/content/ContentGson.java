package ai.elimu.model.v1.gson.content;

import java.util.Calendar;
import ai.elimu.model.enums.content.ContentStatus;
import ai.elimu.model.v1.gson.BaseEntityGson;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
@Deprecated
public abstract class ContentGson extends BaseEntityGson {
    
    private Calendar timeLastUpdate;
    
    private Integer revisionNumber;
    
    private ContentStatus contentStatus;

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
