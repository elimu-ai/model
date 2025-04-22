package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.analytics.LearningEventType;
import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.Calendar;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class LearningEventGson extends BaseEntityGson {

  private Calendar timestamp;

  private String androidId;

  private String packageName;

  private LearningEventType learningEventType;
}
