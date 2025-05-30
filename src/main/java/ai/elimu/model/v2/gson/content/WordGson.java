package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.WordType;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WordGson extends ContentGson {

  private List<LetterSoundGson> letterSounds;

  private WordType wordType;

  public String getText() {
    return letterSounds.stream()
            .flatMap(ls -> ls.getLetters().stream())
            .map(LetterGson::getText)
            .collect(Collectors.joining());
  }
}
