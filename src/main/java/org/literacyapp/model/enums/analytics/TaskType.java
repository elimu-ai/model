package org.literacyapp.model.enums.analytics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.literacyapp.model.enums.content.LiteracySkill;
import org.literacyapp.model.enums.content.NumeracySkill;

// TODO: rename to "LearningType" or "ActivityType"?
public enum TaskType {
    
    LETTER_LISTEN(new HashSet<>(Arrays.asList(LiteracySkill.LETTER_IDENTIFICATION)), null),
    NUMBER_LISTEN(null, new HashSet<>(Arrays.asList(NumeracySkill.NUMBER_IDENTIFICATION))),
    TAG_ITEMS(null, new HashSet<>(Arrays.asList(NumeracySkill.ONE_TO_ONE_CORRESPONDENCE))),
    VIDEO(null, null);
    
    public Set<LiteracySkill> literacySkills;
    
    public Set<NumeracySkill> numeracySkills;
    
    private TaskType(Set<LiteracySkill> literacySkills, Set<NumeracySkill> numeracySkills) {
        this.literacySkills = literacySkills;
        this.numeracySkills = numeracySkills;
    }
}
