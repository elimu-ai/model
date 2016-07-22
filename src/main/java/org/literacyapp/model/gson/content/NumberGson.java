package org.literacyapp.model.gson.content;

import java.util.Set;
import org.literacyapp.model.enums.Locale;

public class NumberGson {
    
    private Long id;
    
    private Locale locale;
    
    private Integer value;
    
    private String symbol;
    
    private WordGson word;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
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
    
    public WordGson getWord() {
        return word;
    }

    public void setWord(WordGson word) {
        this.word = word;
    }
}
