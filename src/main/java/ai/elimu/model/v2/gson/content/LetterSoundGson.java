package ai.elimu.model.v2.gson.content;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LetterSoundGson extends ContentGson {

  private List<LetterGson> letters;

  private List<SoundGson> sounds;
}
