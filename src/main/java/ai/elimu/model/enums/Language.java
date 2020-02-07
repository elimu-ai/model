package ai.elimu.model.enums;

/**
 * This list represents the currently supported languages.
 */
public enum Language {
    
    EN("eng"),
    FI("fil"),
    HI("hin"),
    SW("swa");
    
    /**
     * ISO 639-2 language code. See https://en.wikipedia.org/wiki/List_of_ISO_639-2_codes
     */
    private final String isoCode;
    
    private Language(String isoCode) {
        this.isoCode = isoCode;
    }
    
    public String getIsoCode() {
        return isoCode;
    }
}
