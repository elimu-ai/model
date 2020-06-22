package ai.elimu.model.v2.gson.content;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class LetterGson extends ContentGson {
    
    private String text;
    
    private Boolean diacritic;

    public Boolean getDiacritic() {
        return diacritic;
    }

    public String getText() {
        return text;
    }

    public void setDiacritic(Boolean diacritic) {
        this.diacritic = diacritic;
    }

    public void setText(String text) {
        this.text = text;
    }
}
