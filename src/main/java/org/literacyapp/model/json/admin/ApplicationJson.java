package org.literacyapp.model.json.admin;

import java.util.List;
import java.util.Set;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.literacyapp.model.enums.LiteracySkill;
import org.literacyapp.model.enums.Locale;
import org.literacyapp.model.enums.NumeracySkill;
import org.literacyapp.model.enums.admin.ApplicationStatus;

@Entity
public class ApplicationJson {
    
    @Id
    private Long id;
    
    @NotNull
    private Locale locale;
    
    @NotNull
    private String packageName;
    
    private Set<LiteracySkill> literacySkills;
    
    private Set<NumeracySkill> numeracySkills;
    
    private ApplicationStatus applicationStatus;
    
    private List<ApplicationVersionJson> applicationVersionJsonList;

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

    public List<ApplicationVersionJson> getApplicationVersionJsonList() {
        return applicationVersionJsonList;
    }

    public void setApplicationVersionJsonList(List<ApplicationVersionJson> applicationVersionJsonList) {
        this.applicationVersionJsonList = applicationVersionJsonList;
    }
}
