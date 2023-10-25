package ai.elimu.model.v2.gson.content;

import java.util.Set;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class EmojiGson extends ContentGson {
    
    private String glyph;
    
    private Double unicodeVersion;
    
    private Double unicodeEmojiVersion;
    
    private Set<WordGson> words;

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

    public Set<WordGson> getWords() {
        return words;
    }

    public void setWords(Set<WordGson> words) {
        this.words = words;
    }
}
