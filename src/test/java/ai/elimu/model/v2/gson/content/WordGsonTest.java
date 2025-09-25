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

    /**
     * ['ต', '◌่', 'แ◌'] --> "แต่"
     */
    @Test
    public void testToString_tɛ̀ɛ() {
        LetterGson letterTooTaw = new LetterGson();
        letterTooTaw.setText("ต");

        LetterGson diacriticMaaiEk = new LetterGson();
        diacriticMaaiEk.setText("◌่");

        LetterGson letterSaraAe = new LetterGson();
        letterSaraAe.setText("แ◌◌");

        LetterSoundGson letterSoundT = new LetterSoundGson();
        letterSoundT.setLetters(Arrays.asList(letterTooTaw));

        LetterSoundGson letterSoundLowTone = new LetterSoundGson();
        letterSoundLowTone.setLetters(Arrays.asList(diacriticMaaiEk));

        LetterSoundGson letterSoundAe = new LetterSoundGson();
        letterSoundAe.setLetters(Arrays.asList(letterSaraAe));

        WordGson wordTɛ̀ɛ = new WordGson();
        wordTɛ̀ɛ.setLetterSounds(Arrays.asList(letterSoundT, letterSoundLowTone, letterSoundAe));

        assertEquals("แต่", wordTɛ̀ɛ.toString());
    }

    /**
     * ['จ', '◌้', 'เ◌◌า'] --> "เจ้า"
     */
    @Test
    public void testToString_câaw() {
        LetterGson letterJooJaan = new LetterGson();
        letterJooJaan.setText("จ");

        LetterGson diacriticMaaiThoo = new LetterGson();
        diacriticMaaiThoo.setText("◌้");

        LetterGson letterSaraAw = new LetterGson();
        letterSaraAw.setText("เ◌◌า");

        LetterSoundGson letterSoundJoJaan = new LetterSoundGson();
        letterSoundJoJaan.setLetters(Arrays.asList(letterJooJaan));

        LetterSoundGson letterSoundFallingTone = new LetterSoundGson();
        letterSoundFallingTone.setLetters(Arrays.asList(diacriticMaaiThoo));

        LetterSoundGson letterSoundAw = new LetterSoundGson();
        letterSoundAw.setLetters(Arrays.asList(letterSaraAw));

        WordGson wordCâaw = new WordGson();
        wordCâaw.setLetterSounds(Arrays.asList(letterSoundJoJaan, letterSoundFallingTone, letterSoundAw));

        assertEquals("เจ้า", wordCâaw.toString());
    }

    /**
     * ['ร', 'โ◌', 'ง', 'ร', 'เ◌ีย', 'น'] --> "โรงเรียน"
     */
    @Test
    public void testToString_rooŋrian() {
        LetterGson letterRooRua = new LetterGson();
        letterRooRua.setText("ร");

        LetterGson letterSaraOo = new LetterGson();
        letterSaraOo.setText("โ◌");

        LetterGson letterNgooNuu = new LetterGson();
        letterNgooNuu.setText("ง");

        LetterGson letterSaraIa = new LetterGson();
        letterSaraIa.setText("เ◌ีย");

        LetterGson letterNooNuu = new LetterGson();
        letterNooNuu.setText("น");

        LetterSoundGson letterSoundRooRua = new LetterSoundGson();
        letterSoundRooRua.setLetters(Arrays.asList(letterRooRua));
        
        LetterSoundGson letterSoundSaraOo = new LetterSoundGson();
        letterSoundSaraOo.setLetters(Arrays.asList(letterSaraOo));

        LetterSoundGson letterSoundNgooNuu = new LetterSoundGson();
        letterSoundNgooNuu.setLetters(Arrays.asList(letterNgooNuu));

        LetterSoundGson letterSoundSaraIa = new LetterSoundGson();
        letterSoundSaraIa.setLetters(Arrays.asList(letterSaraIa));

        LetterSoundGson letterSoundNooNuu = new LetterSoundGson();
        letterSoundNooNuu.setLetters(Arrays.asList(letterNooNuu));

        WordGson wordRooŋrian = new WordGson();
        wordRooŋrian.setLetterSounds(Arrays.asList(letterSoundRooRua, letterSoundSaraOo, letterSoundNgooNuu, letterSoundRooRua, letterSoundSaraIa, letterSoundNooNuu));

        assertEquals("โรงเรียน", wordRooŋrian.toString());
    }
}
