package ai.elimu.model.v2.gson.crowdsource;

import ai.elimu.model.v2.gson.BaseEntityGson;
import ai.elimu.model.v2.gson.content.WordGson;
import java.util.Calendar;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class WordContributionEventGson extends BaseEntityGson {
    
    private WordGson word;
    
    private String comment;
    
    private Calendar time;

    public String getComment() {
        return comment;
    }

    public Calendar getTime() {
        return time;
    }

    public WordGson getWord() {
        return word;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public void setWord(WordGson word) {
        this.word = word;
    }
}
