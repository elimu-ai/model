package ai.elimu.model.v2.gson.analytics;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoryBookLearningEventGson extends LearningEventGson {

  private String storyBookTitle;
  
  private Long storyBookId;
}
