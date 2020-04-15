package ai.elimu.model.gson.v2.content;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class WordGson extends ContentGson {
    
    @Deprecated // TODO: replace with list of Letters
    private String text;

    @Deprecated
    public String getText() {
        return text;
    }

    @Deprecated
    public void setText(String text) {
        this.text = text;
    }
}
