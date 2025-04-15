package ai.elimu.model.v2.enums;

import java.util.Locale;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * This list represents the currently supported languages.
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Language {
    
    ENG("eng", "English", "English", new Locale("eng")),
    HIN("hin", "Hindi", "हिन्दी", new Locale("hin")),
    TGL("tgl", "Tagalog", "Tagalog", new Locale("tgl")),
    THA("tha", "Thai", "ไทย", new Locale("tha")),
    VIE("vie", "Vietnamese", "Tiếng Việt", new Locale("vie"));
    
    /**
     * ISO 639-2 language code. See https://en.wikipedia.org/wiki/List_of_ISO_639-2_codes
     */
    private final String isoCode;
    
    private final String englishName;
    
    private final String nativeName;

    private final Locale locale;
}
