package ai.elimu.model.v2.enums;

/**
 * This list represents the currently supported languages.
 */
public enum Language {
    
    BEN("ben", "Bengali", "বাংলা"),
    ENG("eng", "English", "English"),
    FIL("fil", "Filipino", "Pilipino"),
    HIN("hin", "Hindi", "हिन्दी"),
    SWA("swa", "Swahili", "Kiswahili"),
    URD("urd", "Urdu", "اردو"),
    XHO("xho", "Xhosa", "isiXhosa");
    
    /**
     * ISO 639-2 language code. See https://en.wikipedia.org/wiki/List_of_ISO_639-2_codes
     */
    private final String isoCode;
    
    private final String englishName;
    
    private final String nativeName;
    
    private Language(String isoCode, String englishName, String nativeName) {
        this.isoCode = isoCode;
        this.englishName = englishName;
        this.nativeName = nativeName;
    }
    
    public String getIsoCode() {
        return isoCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getNativeName() {
        return nativeName;
    }
}
