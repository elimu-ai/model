package ai.elimu.model.v2.gson.content;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class LetterGson extends ContentGson {
    
    private String text;
    
    private boolean diacritic;

    public String getText() {
        return text;
    }

    public boolean isDiacritic() {
        return diacritic;
    }

    public void setDiacritic(boolean diacritic) {
        this.diacritic = diacritic;
    }

    public void setText(String text) {
        this.text = text;
    }
}
