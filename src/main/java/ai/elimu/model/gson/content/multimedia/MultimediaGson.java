package ai.elimu.model.gson.content.multimedia;

import java.util.List;
import java.util.Set;
import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.content.NumeracySkill;
import ai.elimu.model.gson.content.ContentGson;
import ai.elimu.model.gson.content.LetterGson;
import ai.elimu.model.gson.content.NumberGson;
import ai.elimu.model.gson.content.WordGson;

public abstract class MultimediaGson extends ContentGson {
    
    private String downloadUrl; // URL of file to be downloaded
    
    private Integer downloadSize; // kB

    private String contentType; // MIME type
    
    private Set<LiteracySkill> literacySkills;
    
    private Set<NumeracySkill> numeracySkills;
    
    private List<LetterGson> letters;
    
    private List<NumberGson> numbers;
    
    private List<WordGson> words;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Set<LiteracySkill> getLiteracySkills() {
        return literacySkills;
    }

    public void setLiteracySkills(Set<LiteracySkill> literacySkills) {
        this.literacySkills = literacySkills;
    }

    public Set<NumeracySkill> getNumeracySkills() {
        return numeracySkills;
    }

    public void setNumeracySkills(Set<NumeracySkill> numeracySkills) {
        this.numeracySkills = numeracySkills;
    }

    public List<LetterGson> getLetters() {
        return letters;
    }

    public void setLetters(List<LetterGson> letters) {
        this.letters = letters;
    }

    public List<NumberGson> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberGson> numbers) {
        this.numbers = numbers;
    }

    public List<WordGson> getWords() {
        return words;
    }

    public void setWords(List<WordGson> words) {
        this.words = words;
    }
}
