package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.LetterPosition;
import ai.elimu.model.v2.enums.content.WordType;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WordGson extends ContentGson {

  @Deprecated // TODO: replace with LetterSounds
  private String text;

  private List<LetterSoundGson> letterSounds;

  private WordType wordType;

  public String toString() {
      // Collect all letters from all letter-sounds
      List<LetterGson> letterGsons = letterSounds.stream()
              .flatMap(letterSound -> letterSound.getLetters().stream())
              .collect(Collectors.toList());
      
      // Group by letter position
      Map<LetterPosition, List<LetterGson>> lettersByPosition = letterGsons.stream()
              .collect(Collectors.groupingBy(LetterGson::getPosition));

      // Build in proper visual order
      StringBuilder stringBuilder = new StringBuilder();
      if (lettersByPosition.get(LetterPosition.BEFORE) != null) {
          lettersByPosition.get(LetterPosition.BEFORE).forEach(letter -> stringBuilder.append(letter.getText()));
      }
      if (lettersByPosition.get(LetterPosition.MIDDLE) != null) {
          lettersByPosition.get(LetterPosition.MIDDLE).forEach(letter -> stringBuilder.append(letter.getText()));
      }
      if (lettersByPosition.get(LetterPosition.ABOVE) != null) {
          lettersByPosition.get(LetterPosition.ABOVE).forEach(letter -> stringBuilder.append(letter.getText()));
      }
      if (lettersByPosition.get(LetterPosition.BELOW) != null) {
          lettersByPosition.get(LetterPosition.BELOW).forEach(letter -> stringBuilder.append(letter.getText()));
      }
      if (lettersByPosition.get(LetterPosition.AFTER) != null) {
          lettersByPosition.get(LetterPosition.AFTER).forEach(letter -> stringBuilder.append(letter.getText()));
      }

      return stringBuilder.toString();
  }
}
