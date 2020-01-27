package ai.elimu.model.enums;

/**
 * This list represents the currently supported languages.
 */
public enum Locale {
    
    EN("eng"),
    FI("fil"),
    HI("hin"),
    SW("swa");
    
    /**
     * ISO 639-2 language code.
     */
    private String language;
    
    private Locale(String language) {
        this.language = language;
    }
    
    public String getLanguage() {
        return language;
    }
}
