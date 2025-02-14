package ai.elimu.model.v2.gson.content;

import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EmojiGson extends ContentGson {

  private String glyph;

  private Double unicodeVersion;

  private Double unicodeEmojiVersion;

  private Set<WordGson> words;
}
