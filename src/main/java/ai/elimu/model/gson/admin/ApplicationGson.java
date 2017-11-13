package ai.elimu.model.gson.admin;

import java.util.List;
import java.util.Set;
import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.Locale;
import ai.elimu.model.enums.content.NumeracySkill;
import ai.elimu.model.enums.admin.ApplicationStatus;
import ai.elimu.model.gson.BaseEntityGson;
import lombok.Getter;
import lombok.Setter;

public class ApplicationGson extends BaseEntityGson {

    @Getter
    @Setter
    private Locale locale;

    @Getter
    @Setter
    private String packageName;

    @Getter
    @Setter
    private Set<LiteracySkill> literacySkills;

    @Getter
    @Setter
    private Set<NumeracySkill> numeracySkills;

    @Getter
    @Setter
    private ApplicationStatus applicationStatus;

    @Getter
    @Setter
    private List<ApplicationVersionGson> applicationVersions;

}
