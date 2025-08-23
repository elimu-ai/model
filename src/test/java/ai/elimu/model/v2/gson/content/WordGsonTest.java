package ai.elimu.model.v2.gson.content;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class WordGsonTest {
    
    /**
     * ['ค','น'] --> "คน"
     */
    @Test
    public void testToString_khon() {
        LetterGson letterKhooKhwaai = new LetterGson();
        // letterKhooKhwaai.setText("ค");
        letterKhooKhwaai.setText("kh");

        LetterGson letterNooNuu = new LetterGson();
        // letterNooNuu.setText("น");
        letterNooNuu.setText("n");

        LetterSoundGson letterSoundKho = new LetterSoundGson();
        letterSoundKho.setLetters(Arrays.asList(letterKhooKhwaai));

        LetterSoundGson letterSoundN = new LetterSoundGson();
        letterSoundN.setLetters(Arrays.asList(letterNooNuu));

        WordGson wordKhon = new WordGson();
        wordKhon.setLetterSounds(Arrays.asList(letterSoundKho, letterSoundN));

        // assertEquals("คน", wordKhon.toString());
        assertEquals("khn", wordKhon.toString());
    }

    /**
     * ['ป','ไ◌'] --> "ไป"
     */
    @Test
    public void testToString_pai() {
        LetterGson letterPooPlaa = new LetterGson();
        // letterPooPlaa.setText("ป");
        letterPooPlaa.setText("p");

        LetterGson letterSaraAi = new LetterGson();
        // letterSaraAi.setText("ไ◌");
        letterSaraAi.setText("ai◌");

        LetterSoundGson letterSoundP = new LetterSoundGson();
        letterSoundP.setLetters(Arrays.asList(letterPooPlaa));

        LetterSoundGson letterSoundAi = new LetterSoundGson();
        letterSoundAi.setLetters(Arrays.asList(letterSaraAi));

        WordGson wordPai = new WordGson();
        wordPai.setLetterSounds(Arrays.asList(letterSoundP, letterSoundAi));

        // assertEquals("ไป", wordPai.toString());
        assertEquals("aip", wordPai.toString());
    }

    /**
     * ['ฉ', '◌ั', 'น'] --> "ฉัน"
     */
    @Test
    public void testToString_chan() {
        LetterGson letterChooChing = new LetterGson();
        // letterChooChing.setText("ฉ");
        letterChooChing.setText("ch");

        LetterGson letterSaraA = new LetterGson();
        // letterSaraA.setText("◌ั");
        letterSaraA.setText("◌a");

        LetterGson letterNooNuu = new LetterGson();
        // letterNooNuu.setText("น");
        letterNooNuu.setText("n");

        LetterSoundGson letterSoundCh = new LetterSoundGson();
        letterSoundCh.setLetters(Arrays.asList(letterChooChing));

        LetterSoundGson letterSoundA = new LetterSoundGson();
        letterSoundA.setLetters(Arrays.asList(letterSaraA));

        LetterSoundGson letterSoundN = new LetterSoundGson();
        letterSoundN.setLetters(Arrays.asList(letterNooNuu));

        WordGson wordChan = new WordGson();
        wordChan.setLetterSounds(Arrays.asList(letterSoundCh, letterSoundA, letterSoundN));

        // assertEquals("ฉัน", wordChan.toString());
        assertEquals("chan", wordChan.toString());
    }
}
