package ai.elimu.model.v2.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * This list represents the currently supported languages.
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Language {
    
    ENG("eng", "English", "English"),
    HIN("hin", "Hindi", "हिन्दी"),
    TGL("tgl", "Tagalog", "Tagalog"),
    THA("tha", "Thai", "ไทย");
    
    /**
     * ISO 639-2 language code. See https://en.wikipedia.org/wiki/List_of_ISO_639-2_codes
     */
    private final String isoCode;
    
    private final String englishName;
    
    private final String nativeName;
}
