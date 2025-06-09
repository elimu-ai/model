package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.analytics.AssessmentEventType;
import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.Calendar;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Based on https://github.com/elimu-ai/webapp/blob/main/src/main/java/ai/elimu/entity/analytics/AssessmentEvent.java
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class AssessmentEventGson extends BaseEntityGson {

  private Calendar timestamp;

  /**
   * A 64-bit number (expressed as a hexadecimal string), unique to each combination of 
   * app-signing key, user, and device.
   * 
   * See https://developer.android.com/reference/android/provider/Settings.Secure#ANDROID_ID
   */
  private String androidId;

  /**
   * The package name of the {@link #application} where the assessment event occurred.
   * E.g. <code>ai.elimu.soundcards</code>.
   */
  private String packageName;

  /**
   * A value in the range [0.0, 1.0].
   */
  private Float masteryScore;

  /**
   * The number of milliseconds passed between the student opening the assessment task 
   * and submitting a response. E.g. <code>15000</code>.
   */
  private Long timeSpentMs;

  /**
   * Any additional data should be stored in the format of a JSON object.
   * 
   * Example:
   * <pre>
   * {'word_ids_presented': [1,2,3], 'word_id_selected': [2]}
   * </pre>
   */
  private String additionalData;

  private AssessmentEventType assessmentEventType;
}
