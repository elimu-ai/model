package ai.elimu.model.v2.gson.content;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LetterGson extends ContentGson {

  private String text;
  
  private Boolean diacritic;
}
