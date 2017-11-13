package ai.elimu.model.enums.analytics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.content.NumeracySkill;
import lombok.AllArgsConstructor;

// TODO: rename to "LearningType" or "ActivityType"?
@AllArgsConstructor
public enum TaskType {
    
    LETTER_LISTEN(new HashSet<>(Arrays.asList(LiteracySkill.LETTER_IDENTIFICATION)), null),
    NUMBER_LISTEN(null, new HashSet<>(Arrays.asList(NumeracySkill.NUMBER_IDENTIFICATION))),
    TAG_ITEMS(null, new HashSet<>(Arrays.asList(NumeracySkill.ONE_TO_ONE_CORRESPONDENCE))),
    VIDEO(null, null);
    
    public Set<LiteracySkill> literacySkills;
    
    public Set<NumeracySkill> numeracySkills;
    
}
