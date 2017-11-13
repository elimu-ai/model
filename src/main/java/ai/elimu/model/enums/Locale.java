package ai.elimu.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * This list represents the currently supported languages.
 */
@AllArgsConstructor
public enum Locale {

    AR("ar"),
    EN("en"),
//    EN_US("en", "US"),
    ES("es"),
    SW("sw");

    @Getter
    private String language;

    @Getter
    private String country;

    private Locale(String language) {
        this.language = language;
    }

}
