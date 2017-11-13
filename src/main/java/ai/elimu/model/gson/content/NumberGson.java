package ai.elimu.model.gson.content;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class NumberGson extends ContentGson {

    @Getter
    @Setter
    private Integer value;

    @Getter
    @Setter
    private String symbol;
    
    @Deprecated
    @Getter
    @Setter
    private WordGson word;

    @Getter
    @Setter
    private List<WordGson> words;

}
