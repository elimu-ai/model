package org.literacyapp.model.enums;

public enum Language {
    
    ARABIC("ar"),
    ENGLISH("en"),
    SPANISH("es"),
    SWAHILI("sw");
    
    private String designator;
    
    private Language(String designator) {
        this.designator = designator;
    }
    
    public String getDesignator() {
        return designator;
    }
}
