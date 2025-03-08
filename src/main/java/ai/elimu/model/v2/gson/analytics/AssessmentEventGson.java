package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.analytics.AssessmentEventType;
import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.Calendar;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class AssessmentEventGson extends BaseEntityGson {

  private Calendar timestamp;

  private String androidId;

  private String packageName;

  private AssessmentEventType assessmentEventType;
}
