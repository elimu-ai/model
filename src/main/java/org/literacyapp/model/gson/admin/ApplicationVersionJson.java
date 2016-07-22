package org.literacyapp.model.gson.admin;

import java.util.Calendar;

public class ApplicationVersionJson {
    
    private Long id;
    
    private ApplicationJson applicationJson;
    
    private Integer fileSizeInKb;
    
    private String fileUrl;
    
    private String contentType;
    
    private Integer versionCode;
    
    private String startCommand;
    
//    @NotNull
//    private Calendar timeUploaded;

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
    
    public String getStartCommand() {
        return startCommand;
    }

    public void setStartCommand(String startCommand) {
        this.startCommand = startCommand;
    }

//    public Calendar getTimeUploaded() {
//        return timeUploaded;
//    }
//
//    public void setTimeUploaded(Calendar timeUploaded) {
//        this.timeUploaded = timeUploaded;
//    }
}
