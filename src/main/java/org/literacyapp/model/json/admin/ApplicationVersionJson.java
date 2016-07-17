package org.literacyapp.model.json.admin;

import java.util.Calendar;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;

@Entity
public class ApplicationVersionJson {
    
    @Id
    private Long id;
    
    @ToOne
    private ApplicationJson applicationJson;
    
    @NotNull
    private Integer fileSizeInKb;
    
    @NotNull
    private String fileUrl;
    
    @NotNull
    private String contentType;
    
    @NotNull
    private Integer versionCode;
    
    @NotNull
    private Calendar timeUploaded;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ApplicationJson getApplicationJson() {
        return applicationJson;
    }

    public void setApplicationJson(ApplicationJson applicationJson) {
        this.applicationJson = applicationJson;
    }

    public Integer getFileSizeInKb() {
        return fileSizeInKb;
    }

    public void setFileSizeInKb(Integer fileSizeInKb) {
        this.fileSizeInKb = fileSizeInKb;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public Calendar getTimeUploaded() {
        return timeUploaded;
    }

    public void setTimeUploaded(Calendar timeUploaded) {
        this.timeUploaded = timeUploaded;
    }
}
