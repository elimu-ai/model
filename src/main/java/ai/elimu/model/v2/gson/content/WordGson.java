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
      System.out.println("WordGson#getId(): " + getId());

      // Convert from List<LetterSoundGson> to List<String>
      List<String> wordLetters = new ArrayList<>();
      for (LetterSoundGson letterSound : letterSounds) {
          List<LetterGson> letterGsons = letterSound.getLetters();
          String letterSoundLetters = letterGsons.stream().map(LetterGson::getText).collect(Collectors.joining());
          wordLetters.add(letterSoundLetters);
      }

      // Re-order letters
      for (int i = 0; i < wordLetters.size(); i++) {
          String wordLetter = wordLetters.get(i);
          if (wordLetter.contains("◌")) {
              if (wordLetter.endsWith("◌")) {
                  // E.g. 'ไ◌'
                  
                  // Remove the dotted circle (◌)
                  // <'ป','ไ◌'> --> <'ป','ไ'>
                  wordLetters.set(i, wordLetter.substring(0, wordLetter.length() - 1));

                  // Shift the letter one position to the left
                  // <'ป','ไ'> --> <'ไ','ป'>
                  Collections.swap(wordLetters, i - 1, i);
              } else if (wordLetter.startsWith("◌")) {
                  // E.g 'จ◌ะ'
                  
                  // Remove the dotted circle (◌)
                  // <'จ','◌ะ'> --> <'จ','ะ'>
                  wordLetters.set(i, wordLetter.substring(1, wordLetter.length()));
              } else {
                // E.g. 'เ◌า'

                // Expect to find a consonant on position to the left
                // <'ข','เ◌า'>
                String consonant = wordLetters.get(i - 1);

                // Replace the dotted circle (◌) with the consonant
                // <'ข','เ◌า'> --> <'ข','เขา'>
                wordLetter = wordLetter.replaceFirst("◌", consonant);
                wordLetters.set(i, wordLetter);

                // Delete the consonant
                // <'ข','เขา'> --> <'เขา'>
                wordLetters.remove(i - 1);
              }
          }
      }

      return wordLetters.stream().collect(Collectors.joining());
  }
}
