package org.literacyapp.model.gson.content;

public class NumberGson extends ContentGson {
    
    private Integer value;
    
    private String symbol;
    
    private WordGson word;

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
