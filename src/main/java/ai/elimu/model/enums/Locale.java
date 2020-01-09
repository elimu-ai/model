package ai.elimu.model.enums;

/**
 * This list represents the currently supported languages.
 */
public enum Locale {
    
    EN("en"),
    HI("hi"),
    SW("sw");
    
    /**
     * ISO 639-1 language code.
     */
    private String language;
    
    private Locale(String language) {
        this.language = language;
    }
    
    public String getLanguage() {
        return language;
    }
}
