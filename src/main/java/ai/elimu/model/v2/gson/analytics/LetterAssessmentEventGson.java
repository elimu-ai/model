package ai.elimu.model.v2.gson.analytics;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LetterAssessmentEventGson extends AssessmentEventGson {

  private Long letterId;

  private String letterText;

  private Float masteryScore;

  private Long timeSpentMs;
}
