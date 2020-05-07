package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v1.gson.BaseEntityGson;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public abstract class ContentGson extends BaseEntityGson {
    
    private Integer revisionNumber;

    public Integer getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(Integer revisionNumber) {
        this.revisionNumber = revisionNumber;
    }
}
