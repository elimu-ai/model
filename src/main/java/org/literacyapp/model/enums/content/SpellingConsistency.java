package org.literacyapp.model.enums.content;

/**
 * Grapheme-to-phoneme correspondence
 */
public enum SpellingConsistency {

    PERFECT, // 100% correspondence
    HIGHLY_PHONEMIC, // 80%-99% correspondence
    PHONEMIC, // 60%-79% correspondence
    NON_PHONEMIC, // 40%-59% correspondence
    HIGHLY_NON_PHONEMIC // 0%-39% correspondence
}
