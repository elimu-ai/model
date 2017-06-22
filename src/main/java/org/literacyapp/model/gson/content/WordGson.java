package org.literacyapp.model.gson.content;

import org.literacyapp.model.enums.content.SpellingConsistency;
import org.literacyapp.model.enums.content.WordType;

public class WordGson extends ContentGson {
    
    private String text;
    
    private String phonetics; // IPA
    
    private int usageCount; // Based on StoryBook content
    
    private WordType wordType;
    
    private SpellingConsistency spellingConsistency;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(String phonetics) {
        this.phonetics = phonetics;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public WordType getWordType() {
        return wordType;
    }

    public void setWordType(WordType wordType) {
        this.wordType = wordType;
    }

    public SpellingConsistency getSpellingConsistency() {
        return spellingConsistency;
    }

    public void setSpellingConsistency(SpellingConsistency spellingConsistency) {
        this.spellingConsistency = spellingConsistency;
    }
}
