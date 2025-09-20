package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.WordType;

import java.util.ArrayList;
import java.util.Collections;
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

  @Deprecated // TODO: replace with toString()
  private String text;

  private List<LetterSoundGson> letterSounds;

  private WordType wordType;

  /**
   * Look for letters that contain the dotted circle (◌) as a placeholder, 
   * and re-order them according to their position in the word:
   * BEFORE -> MIDDLE -> ABOVE -> BELOW -> AFTER
   * 
   * Example: ['ป','ไ◌'] --> "ไป"
   */
  public String toString() {
      // Convert from List<LetterSoundGson> to List<String>
      List<String> letterSequences = new ArrayList<>();
      for (LetterSoundGson letterSound : letterSounds) {
          List<LetterGson> letterGsons = letterSound.getLetters();
          String letterSoundLetters = letterGsons.stream().map(LetterGson::getText).collect(Collectors.joining());
          letterSequences.add(letterSoundLetters);
      }

      // Re-order letter sequences
      for (int i = 0; i < letterSequences.size(); i++) {
          String letterSequence = letterSequences.get(i);
          if (letterSequence.contains("◌◌")) {
              if (letterSequence.endsWith("◌◌")) {
                  // E.g. 'ใ◌◌'
                  
                  // Remove the two dotted circles (◌◌)
                  // <'ค','ร','ใ◌◌'> --> <'ค','ร','ใ'>
                  letterSequence = letterSequence.substring(0, letterSequence.length() - 2);
                  letterSequences.set(i, letterSequence);

                  // Shift the letter sequence two positions to the left
                  // <'ค','ร','ใ'> --> <'ใ','ค','ร'>
                  Collections.swap(letterSequences, i, i - 1);
                  Collections.swap(letterSequences, i - 1, i - 2);
              } else {
                // E.g. 'เ◌◌า'

                // Expect to find two letter sequences to the left
                // <'จ', '◌้', 'เ◌◌า'>
                String letterSequence1 = letterSequences.get(i - 2);
                String letterSequence2 = letterSequences.get(i - 1);

                // Replace the two dotted circles (◌◌) with the two letter sequences
                // <'จ', '◌้', 'เ◌◌า'> --> <'จ', '◌้', 'เจ◌้า'>
                letterSequence = letterSequence.replaceFirst("◌", letterSequence1);
                letterSequence = letterSequence.replaceFirst("◌", letterSequence2);
                letterSequences.set(i, letterSequence);

                // Delete the two letter sequences
                // <'จ', '◌้', 'เจ◌้า'> --> <'เจ◌้า'>
                letterSequences.remove(0);
                letterSequences.remove(0);
              }
          } else if (letterSequence.contains("◌")) {
              if (letterSequence.endsWith("◌")) {
                  // E.g. 'ไ◌'
                  
                  // Remove the dotted circle (◌)
                  // <'ป','ไ◌'> --> <'ป','ไ'>
                  letterSequences.set(i, letterSequence.substring(0, letterSequence.length() - 1));

                  // Shift the letter sequence one position to the left
                  // <'ป','ไ'> --> <'ไ','ป'>
                  Collections.swap(letterSequences, i, i - 1);
              } else if (letterSequence.startsWith("◌")) {
                  // E.g '◌ะ'
                  
                  // Remove the dotted circle (◌)
                  // <'จ','◌ะ'> --> <'จ','ะ'>
                  letterSequences.set(i, letterSequence.substring(1, letterSequence.length()));
              } else {
                // E.g. 'เ◌า'

                // Expect to find a consonant one position to the left
                // <'ข','เ◌า'>
                String consonant = letterSequences.get(i - 1);

                // Replace the dotted circle (◌) with the consonant
                // <'ข','เ◌า'> --> <'ข','เขา'>
                letterSequence = letterSequence.replaceFirst("◌", consonant);
                letterSequences.set(i, letterSequence);

                // Delete the consonant
                // <'ข','เขา'> --> <'เขา'>
                letterSequences.remove(0);
              }
          }
      }

      return letterSequences.stream().collect(Collectors.joining());
  }
}
