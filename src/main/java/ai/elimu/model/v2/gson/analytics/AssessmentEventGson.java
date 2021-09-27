package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.analytics.AssessmentEventType;
import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.Calendar;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public abstract class AssessmentEventGson extends BaseEntityGson {
    
    private Calendar time;
    
    private String androidId;
    
    private String packageName;
    
    private AssessmentEventType assessmentEventType;
    
    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    
    public AssessmentEventType getAssessmentEventType() {
        return assessmentEventType;
    }
    
    public void setAssessmentEventType(AssessmentEventType assessmentEventType) {
        this.assessmentEventType = assessmentEventType;
    }
}
