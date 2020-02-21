package ai.elimu.model.gson.content;

import ai.elimu.model.enums.content.allophone.ConsonantPlace;
import ai.elimu.model.enums.content.allophone.ConsonantType;
import ai.elimu.model.enums.content.allophone.ConsonantVoicing;
import ai.elimu.model.enums.content.allophone.LipRounding;
import ai.elimu.model.enums.content.allophone.SoundType;
import ai.elimu.model.enums.content.allophone.VowelFrontness;
import ai.elimu.model.enums.content.allophone.VowelHeight;
import ai.elimu.model.enums.content.allophone.VowelLength;
import ai.elimu.model.gson.content.multimedia.AudioGson;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class AllophoneGson extends ContentGson {
    
    private String valueIpa;
    
    private String valueSampa;
    
    private AudioGson audio;
    
    private boolean diacritic;
    
    private SoundType soundType;
    
    private VowelLength vowelLength;
  
    private VowelHeight vowelHeight;

    private VowelFrontness vowelFrontness;
    
    private LipRounding lipRounding;
    
    private ConsonantType consonantType;
    
    private ConsonantPlace consonantPlace;
    
    private ConsonantVoicing consonantVoicing;
    
    private int usageCount;

    public String getValueIpa() {
        return valueIpa;
    }

    public void setValueIpa(String valueIpa) {
        this.valueIpa = valueIpa;
    }

    public String getValueSampa() {
        return valueSampa;
    }

    public void setValueSampa(String valueSampa) {
        this.valueSampa = valueSampa;
    }
    
    public AudioGson getAudio() {
        return audio;
    }

    public void setAudio(AudioGson audio) {
        this.audio = audio;
    }
    
    public boolean isDiacritic() {
        return diacritic;
    }

    public void setDiacritic(boolean diacritic) {
        this.diacritic = diacritic;
    }

    public SoundType getSoundType() {
        return soundType;
    }

    public void setSoundType(SoundType soundType) {
        this.soundType = soundType;
    }

    public VowelLength getVowelLength() {
        return vowelLength;
    }

    public void setVowelLength(VowelLength vowelLength) {
        this.vowelLength = vowelLength;
    }

    public VowelHeight getVowelHeight() {
        return vowelHeight;
    }

    public void setVowelHeight(VowelHeight vowelHeight) {
        this.vowelHeight = vowelHeight;
    }

    public VowelFrontness getVowelFrontness() {
        return vowelFrontness;
    }

    public void setVowelFrontness(VowelFrontness vowelFrontness) {
        this.vowelFrontness = vowelFrontness;
    }

    public LipRounding getLipRounding() {
        return lipRounding;
    }

    public void setLipRounding(LipRounding lipRounding) {
        this.lipRounding = lipRounding;
    }

    public ConsonantType getConsonantType() {
        return consonantType;
    }

    public void setConsonantType(ConsonantType consonantType) {
        this.consonantType = consonantType;
    }

    public ConsonantPlace getConsonantPlace() {
        return consonantPlace;
    }

    public void setConsonantPlace(ConsonantPlace consonantPlace) {
        this.consonantPlace = consonantPlace;
    }

    public ConsonantVoicing getConsonantVoicing() {
        return consonantVoicing;
    }

    public void setConsonantVoicing(ConsonantVoicing consonantVoicing) {
        this.consonantVoicing = consonantVoicing;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }
}
