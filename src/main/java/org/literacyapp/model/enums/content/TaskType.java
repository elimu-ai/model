package org.literacyapp.model.enums.content;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum TaskType {
    
    LETTER_LISTEN(new HashSet<>(Arrays.asList(LiteracySkill.GRAPHEME_KNOWLEDGE)), null),
    NUMBER_LISTEN(null, new HashSet<>(Arrays.asList(NumeracySkill.NUMBER_IDENTIFICATION))),
    TAG_ITEMS(null, new HashSet<>(Arrays.asList(NumeracySkill.ONE_TO_ONE_CORRESPONDENCE)));
    
    public Set<LiteracySkill> literacySkills;
    
    public Set<NumeracySkill> numeracySkills;
    
    private TaskType(Set<LiteracySkill> literacySkills, Set<NumeracySkill> numeracySkills) {
        this.literacySkills = literacySkills;
        this.numeracySkills = numeracySkills;
    }
}
