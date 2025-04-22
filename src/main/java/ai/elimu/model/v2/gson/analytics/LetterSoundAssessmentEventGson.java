package ai.elimu.model.v2.gson.analytics;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LetterSoundAssessmentEventGson extends AssessmentEventGson {

  private Long letterSoundId;

  private String[] letterSoundLetterTexts;

  private String[] letterSoundSoundValuesIpa;

  private Float masteryScore;

  private Long timeSpentMs;
}
