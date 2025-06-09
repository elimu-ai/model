package ai.elimu.model.v2.gson.analytics;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Based on https://github.com/elimu-ai/webapp/blob/main/src/main/java/ai/elimu/entity/analytics/NumberAssessmentEvent.java
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NumberAssessmentEventGson extends AssessmentEventGson {

  /**
   * The number represented as an Integer. E.g. <code>10</code>.
   */
  private Integer numberValue;

  /**
   * The number represented as a symbol specific to the language. E.g. <code>"१०"</code>.
   */
  private String symbol;

  /**
   * This field might not be included, e.g. if the assessment task was done in a 
   * 3rd-party app that did not load the content from the elimu.ai Content Provider. 
   * In this case, the {@link #letterSoundId} will be {@code null}.
   */
  private Long numberId;

  /**
   * A value in the range [0.0, 1.0].
   */
  private Float masteryScore;

  /**
   * The number of milliseconds passed between the student opening the assessment task 
   * and submitting a response. E.g. <code>15000</code>.
   */
  private Long timeSpentMs;
}
