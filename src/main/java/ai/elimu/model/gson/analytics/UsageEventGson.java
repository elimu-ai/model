package ai.elimu.model.gson.analytics;

import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.content.NumeracySkill;
import ai.elimu.model.gson.StudentGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import ai.elimu.model.gson.content.LetterGson;
import ai.elimu.model.gson.content.NumberGson;
import ai.elimu.model.gson.content.WordGson;
import lombok.Getter;
import lombok.Setter;

@Deprecated
public class UsageEventGson extends DeviceEventGson {

    @Getter
    @Setter
    private ApplicationGson application;

    @Getter
    @Setter
    private StudentGson student;

    @Getter
    @Setter
    private LiteracySkill literacySkill;

    @Getter
    @Setter
    private NumeracySkill numeracySkill;

    @Getter
    @Setter
    private LetterGson letter;

    @Getter
    @Setter
    private NumberGson number;

    @Getter
    @Setter
    private WordGson word;

}
