package ai.elimu.model.gson.content;

import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class NumberGson extends ContentGson {
    
    private Integer value;
    
    private String symbol;
    
    @Deprecated
    private WordGson word;
    
    private List<WordGson> words;

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
    
    @Deprecated
    public WordGson getWord() {
        return word;
    }

    @Deprecated
    public void setWord(WordGson word) {
        this.word = word;
    }

    public List<WordGson> getWords() {
        return words;
    }

    public void setWords(List<WordGson> words) {
        this.words = words;
    }
}
