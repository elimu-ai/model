package ai.elimu.model.v2.gson.application;

import ai.elimu.model.v2.enums.admin.ApplicationStatus;
import ai.elimu.model.v2.enums.content.LiteracySkill;
import ai.elimu.model.v2.enums.content.NumeracySkill;
import ai.elimu.model.v2.gson.BaseEntityGson;
import java.util.List;
import java.util.Set;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class ApplicationGson extends BaseEntityGson {
    
    private String packageName;
    
    private Boolean infrastructural;
    
    private Set<LiteracySkill> literacySkills;
    
    private Set<NumeracySkill> numeracySkills;
    
    private ApplicationStatus applicationStatus;
    
    private List<ApplicationVersionGson> applicationVersions;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Boolean isInfrastructural() {
        return infrastructural;
    }

    public void setInfrastructural(Boolean isInfrastructural) {
        this.infrastructural = isInfrastructural;
    }

    public Set<LiteracySkill> getLiteracySkills() {
        return literacySkills;
    }

    public void setLiteracySkills(Set<LiteracySkill> literacySkills) {
        this.literacySkills = literacySkills;
    }

    public Set<NumeracySkill> getNumeracySkills() {
        return numeracySkills;
    }

    public void setNumeracySkills(Set<NumeracySkill> numeracySkills) {
        this.numeracySkills = numeracySkills;
    }

    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public List<ApplicationVersionGson> getApplicationVersions() {
        return applicationVersions;
    }

    public void setApplicationVersions(List<ApplicationVersionGson> applicationVersions) {
        this.applicationVersions = applicationVersions;
    }
}
