package org.literacyapp.model.gson.content.multimedia;

import java.util.Set;
import org.literacyapp.model.enums.content.LiteracySkill;
import org.literacyapp.model.enums.content.NumeracySkill;
import org.literacyapp.model.gson.content.ContentGson;

public abstract class MultimediaGson extends ContentGson {
    
    private String downloadUrl; // URL of file to be downloaded
    
    private Integer downloadSize; // kB

    private String contentType; // MIME type
    
    private Set<LiteracySkill> literacySkills;
    
    private Set<NumeracySkill> numeracySkills;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
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
}
