package org.literacyapp.model.gson.content;

import org.literacyapp.model.enums.content.allophone.ConsonantPlace;
import org.literacyapp.model.enums.content.allophone.ConsonantType;
import org.literacyapp.model.enums.content.allophone.ConsonantVoicing;
import org.literacyapp.model.enums.content.allophone.LipRounding;
import org.literacyapp.model.enums.content.allophone.SoundType;
import org.literacyapp.model.enums.content.allophone.VowelFrontness;
import org.literacyapp.model.enums.content.allophone.VowelHeight;
import org.literacyapp.model.enums.content.allophone.VowelLength;

public class AllophoneGson extends ContentGson {
    
    private String valueIpa; // IPA - International Phonetic Alphabet
    
    private String valueSampa; // X-SAMPA - Extended Speech Assessment Methods Phonetic Alphabet
    
    private SoundType soundType;
    
    private VowelLength vowelLength;
  
    private VowelHeight vowelHeight;

    private VowelFrontness vowelFrontness;
    
    private LipRounding lipRounding;
    
    private ConsonantType consonantType;
    
    private ConsonantPlace consonantPlace;
    
    private ConsonantVoicing consonantVoicing;

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
}
