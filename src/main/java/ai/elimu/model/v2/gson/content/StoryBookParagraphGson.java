package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoryBookParagraphGson extends BaseEntityGson {

  private Integer sortOrder;

  private String originalText;

  private List<WordGson> words;
}
