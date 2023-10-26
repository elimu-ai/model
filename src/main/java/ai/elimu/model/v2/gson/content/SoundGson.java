package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.sound.SoundType;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class SoundGson extends ContentGson {
    
    private String valueIpa;
    
    private Boolean diacritic;
    
    private SoundType soundType;

    public Boolean getDiacritic() {
        return diacritic;
    }

    public SoundType getSoundType() {
        return soundType;
    }

    public String getValueIpa() {
        return valueIpa;
    }

    public void setDiacritic(Boolean diacritic) {
        this.diacritic = diacritic;
    }

    public void setSoundType(SoundType soundType) {
        this.soundType = soundType;
    }

    public void setValueIpa(String valueIpa) {
        this.valueIpa = valueIpa;
    }
}
