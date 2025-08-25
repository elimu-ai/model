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
        letterKhooKhwaai.setText("ค");

        LetterGson letterNooNuu = new LetterGson();
        letterNooNuu.setText("น");

        LetterSoundGson letterSoundKho = new LetterSoundGson();
        letterSoundKho.setLetters(Arrays.asList(letterKhooKhwaai));

        LetterSoundGson letterSoundN = new LetterSoundGson();
        letterSoundN.setLetters(Arrays.asList(letterNooNuu));

        WordGson wordKhon = new WordGson();
        wordKhon.setLetterSounds(Arrays.asList(letterSoundKho, letterSoundN));

        assertEquals("คน", wordKhon.toString());
    }

    /**
     * ['ป','ไ◌'] --> "ไป"
     */
    @Test
    public void testToString_pai() {
        LetterGson letterPooPlaa = new LetterGson();
        letterPooPlaa.setText("ป");

        LetterGson letterSaraAi = new LetterGson();
        letterSaraAi.setText("ไ◌");

        LetterSoundGson letterSoundP = new LetterSoundGson();
        letterSoundP.setLetters(Arrays.asList(letterPooPlaa));

        LetterSoundGson letterSoundAi = new LetterSoundGson();
        letterSoundAi.setLetters(Arrays.asList(letterSaraAi));

        WordGson wordPai = new WordGson();
        wordPai.setLetterSounds(Arrays.asList(letterSoundP, letterSoundAi));

        assertEquals("ไป", wordPai.toString());
    }

    /**
     * ['ฉ', '◌ั', 'น'] --> "ฉัน"
     */
    @Test
    public void testToString_chan() {
        LetterGson letterChooChing = new LetterGson();
        letterChooChing.setText("ฉ");

        LetterGson letterSaraA = new LetterGson();
        letterSaraA.setText("◌ั");

        LetterGson letterNooNuu = new LetterGson();
        letterNooNuu.setText("น");

        LetterSoundGson letterSoundCh = new LetterSoundGson();
        letterSoundCh.setLetters(Arrays.asList(letterChooChing));

        LetterSoundGson letterSoundA = new LetterSoundGson();
        letterSoundA.setLetters(Arrays.asList(letterSaraA));

        LetterSoundGson letterSoundN = new LetterSoundGson();
        letterSoundN.setLetters(Arrays.asList(letterNooNuu));

        WordGson wordChan = new WordGson();
        wordChan.setLetterSounds(Arrays.asList(letterSoundCh, letterSoundA, letterSoundN));

        assertEquals("ฉัน", wordChan.toString());
    }

    /**
     * ['ข', 'เ◌า'] --> "เขา"
     */
    @Test
    public void testToString_khaw() {
        LetterGson letterKhooKhai = new LetterGson();
        letterKhooKhai.setText("ข");

        LetterGson letterAw = new LetterGson();
        letterAw.setText("เ◌า");

        LetterSoundGson letterSoundKh = new LetterSoundGson();
        letterSoundKh.setLetters(Arrays.asList(letterKhooKhai));

        LetterSoundGson letterSoundAw = new LetterSoundGson();
        letterSoundAw.setLetters(Arrays.asList(letterAw));

        WordGson wordKhaw = new WordGson();
        wordKhaw.setLetterSounds(Arrays.asList(letterSoundKh, letterSoundAw));

        assertEquals("เขา", wordKhaw.toString());
    }

    /**
     * ['ค', 'ร', 'ใ◌◌'] --> "ใคร"
     */
    @Test
    public void testToString_khrai() {
        LetterGson letterKhooKhwaai = new LetterGson();
        letterKhooKhwaai.setText("ค");

        LetterGson letterRooRua = new LetterGson();
        letterRooRua.setText("ร");

        LetterGson letterSaraAi = new LetterGson();
        letterSaraAi.setText("ใ◌◌");

        LetterSoundGson letterSoundKh = new LetterSoundGson();
        letterSoundKh.setLetters(Arrays.asList(letterKhooKhwaai));

        LetterSoundGson letterSoundR = new LetterSoundGson();
        letterSoundR.setLetters(Arrays.asList(letterRooRua));

        LetterSoundGson letterSoundAi = new LetterSoundGson();
        letterSoundAi.setLetters(Arrays.asList(letterSaraAi));

        WordGson wordKhrai = new WordGson();
        wordKhrai.setLetterSounds(Arrays.asList(letterSoundKh, letterSoundR, letterSoundAi));

        assertEquals("ใคร", wordKhrai.toString());
    }
}
