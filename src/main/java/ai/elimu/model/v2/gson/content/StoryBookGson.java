package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.ReadingLevel;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoryBookGson extends ContentGson {

  private String title;

  private String description;

  private ImageGson coverImage;

  private ReadingLevel readingLevel;

  private List<StoryBookChapterGson> storyBookChapters;
}
