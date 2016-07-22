package org.literacyapp.model.gson.admin;

import java.util.List;
import java.util.Set;
import org.literacyapp.model.enums.content.LiteracySkill;
import org.literacyapp.model.enums.Locale;
import org.literacyapp.model.enums.content.NumeracySkill;
import org.literacyapp.model.enums.admin.ApplicationStatus;

public class ApplicationGson {
    
    private Long id;
    
    private Locale locale;
    
    private String packageName;
    
    private Set<LiteracySkill> literacySkills;
    
    private Set<NumeracySkill> numeracySkills;
    
    private ApplicationStatus applicationStatus;
    
    private List<ApplicationVersionGson> applicationVersionJsonList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
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

    public List<ApplicationVersionGson> getApplicationVersionJsonList() {
        return applicationVersionJsonList;
    }

    public void setApplicationVersionJsonList(List<ApplicationVersionGson> applicationVersionJsonList) {
        this.applicationVersionJsonList = applicationVersionJsonList;
    }
}
