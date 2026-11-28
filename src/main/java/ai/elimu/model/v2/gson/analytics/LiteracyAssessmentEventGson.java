package ai.elimu.model.v2.gson.analytics;

import ai.elimu.model.v2.enums.content.LiteracySkill;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LiteracyAssessmentEventGson extends AssessmentEventGson {

  private LiteracySkill literacySkill;
}
