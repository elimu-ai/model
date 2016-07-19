package org.literacyapp.model.enums.content;

import org.literacyapp.model.enums.content.NumeracySkill;
import org.literacyapp.model.enums.content.LiteracySkill;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum TaskType {
    
    LETTER_LISTEN(new HashSet<>(Arrays.asList(LiteracySkill.GRAPHEME_KNOWLEDGE)), null),
    NUMBER_LISTEN(null, new HashSet<>(Arrays.asList(NumeracySkill.NUMBER_IDENTIFICATION)));
    
    public Set<LiteracySkill> literacySkills;
    
    public Set<NumeracySkill> numeracySkills;
    
    TaskType(Set<LiteracySkill> literacySkills, Set<NumeracySkill> numeracySkills) {
        this.literacySkills = literacySkills;
        this.numeracySkills = numeracySkills;
    }
}
