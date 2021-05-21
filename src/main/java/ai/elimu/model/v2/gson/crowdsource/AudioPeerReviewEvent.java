package ai.elimu.model.v2.gson.crowdsource;

import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.Calendar;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class AudioPeerReviewEvent extends BaseEntityGson {
    
    private AudioContributionEventGson audioContributionEvent;
    
    private Boolean approved;
    
    private String comment;
    
    private Calendar time;

    public AudioContributionEventGson getAudioContributionEvent() {
        return audioContributionEvent;
    }

    public void setAudioContributionEvent(AudioContributionEventGson audioContributionEvent) {
        this.audioContributionEvent = audioContributionEvent;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
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
