package org.literacyapp.model.json;

import org.greenrobot.greendao.annotation.Entity;
import org.literacyapp.model.enums.Language;

@Entity
public class NumberJson {
    
    private Long id;
    
    private Language language;
    
    private Integer value;
    
    private String symbol;
    
    private WordJson word;
    
    private int[] dominantColor; // RGB array

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public WordJson getWord() {
        return word;
    }

    public void setWord(WordJson word) {
        this.word = word;
    }

    public int[] getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(int[] dominantColor) {
        this.dominantColor = dominantColor;
    }
}
