package ai.elimu.model.v2.gson.crowdsource;

import ai.elimu.model.v2.gson.BaseEntityGson;
import ai.elimu.model.v2.gson.content.NumberGson;
import java.util.Calendar;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class NumberContributionEventGson extends BaseEntityGson {
    
    private NumberGson number;
    
    private String comment;
    
    private Calendar time;

    public NumberGson getNumber() {
        return number;
    }

    public void setNumber(NumberGson number) {
        this.number = number;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }
}
