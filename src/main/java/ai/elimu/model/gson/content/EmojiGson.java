package ai.elimu.model.gson.content;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class EmojiGson extends ContentGson {
    
    private String glyph;
    
    private Double unicodeVersion;
    
    private Double unicodeEmojiVersion;

    public String getGlyph() {
        return glyph;
    }

    public void setGlyph(String glyph) {
        this.glyph = glyph;
    }

    public Double getUnicodeVersion() {
        return unicodeVersion;
    }

    public void setUnicodeVersion(Double unicodeVersion) {
        this.unicodeVersion = unicodeVersion;
    }

    public Double getUnicodeEmojiVersion() {
        return unicodeEmojiVersion;
    }

    public void setUnicodeEmojiVersion(Double unicodeEmojiVersion) {
        this.unicodeEmojiVersion = unicodeEmojiVersion;
    }
}
