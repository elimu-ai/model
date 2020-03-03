package ai.elimu.model.gson.content;

import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class NumberGson extends ContentGson {
    
    private Integer value;
    
    private String symbol;
    
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

    public List<WordGson> getWords() {
        return words;
    }

    public void setWords(List<WordGson> words) {
        this.words = words;
    }
}
