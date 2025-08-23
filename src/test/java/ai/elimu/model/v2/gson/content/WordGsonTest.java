package ai.elimu.model.v2.gson.content;

import org.junit.jupiter.api.Test;

import ai.elimu.model.v2.enums.content.LetterPosition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class WordGsonTest {
    
    /**
     * ['ค','น'] --> "คน"
     */
    @Test
    public void testToString_khon() {
        LetterGson letterKhooKhwaai = new LetterGson();
        letterKhooKhwaai.setText("ค");
        letterKhooKhwaai.setPosition(LetterPosition.MIDDLE);

        LetterGson letterNooNuu = new LetterGson();
        letterNooNuu.setText("น");
        letterNooNuu.setPosition(LetterPosition.MIDDLE);

        LetterSoundGson letterSoundKho = new LetterSoundGson();
        letterSoundKho.setLetters(Arrays.asList(letterKhooKhwaai));

        LetterSoundGson letterSoundN = new LetterSoundGson();
        letterSoundN.setLetters(Arrays.asList(letterNooNuu));

        WordGson wordGson = new WordGson();
        wordGson.setLetterSounds(Arrays.asList(letterSoundKho, letterSoundN));

        assertEquals("คน", wordGson.toString());
    }

    /**
     * ['ป','ไ'] --> "ไป"
     */
    @Test
    public void testToString_pai() {
        LetterGson letterPooPlaa = new LetterGson();
        letterPooPlaa.setText("ป");
        letterPooPlaa.setPosition(LetterPosition.MIDDLE);

        LetterGson letterSaraAi = new LetterGson();
        letterSaraAi.setText("ไ");
        letterSaraAi.setPosition(LetterPosition.BEFORE);

        LetterSoundGson letterSoundP = new LetterSoundGson();
        letterSoundP.setLetters(Arrays.asList(letterPooPlaa));

        LetterSoundGson letterSoundAi = new LetterSoundGson();
        letterSoundAi.setLetters(Arrays.asList(letterSaraAi));

        WordGson wordGson = new WordGson();
        wordGson.setLetterSounds(Arrays.asList(letterSoundP, letterSoundAi));

        assertEquals("ไป", wordGson.toString());
    }

    /**
     * ['ฉ', ' ั', 'น'] --> "ฉัน"
     */
    @Test
    public void testToString_chan() {
        LetterGson letterChooChing = new LetterGson();
        letterChooChing.setText("ฉ");
        letterChooChing.setPosition(LetterPosition.MIDDLE);

        LetterGson letterSaraA = new LetterGson();
        letterSaraA.setText("ั");
        letterSaraA.setPosition(LetterPosition.ABOVE);

        LetterGson letterNooNuu = new LetterGson();
        letterNooNuu.setText("น");
        letterNooNuu.setPosition(LetterPosition.MIDDLE);

        LetterSoundGson letterSoundKho = new LetterSoundGson();
        letterSoundKho.setLetters(Arrays.asList(letterChooChing));

        LetterSoundGson letterSoundN = new LetterSoundGson();
        letterSoundN.setLetters(Arrays.asList(letterNooNuu));

        WordGson wordGson = new WordGson();
        wordGson.setLetterSounds(Arrays.asList(letterSoundKho, letterSoundN));

        assertEquals("คน", wordGson.toString());
    }
}
