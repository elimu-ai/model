package ai.elimu.model.v2.gson.application;

import ai.elimu.model.v2.enums.admin.ApplicationStatus;
import ai.elimu.model.v2.enums.content.LiteracySkill;
import ai.elimu.model.v2.enums.content.NumeracySkill;
import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.List;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationGson extends BaseEntityGson {

  private String packageName;

  private Boolean infrastructural;

  private Set<LiteracySkill> literacySkills;

  private Set<NumeracySkill> numeracySkills;

  private ApplicationStatus applicationStatus;

  private List<ApplicationVersionGson> applicationVersions;
}
