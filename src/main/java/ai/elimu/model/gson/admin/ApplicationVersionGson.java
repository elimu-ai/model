package ai.elimu.model.gson.admin;

import ai.elimu.model.enums.admin.ApplicationVersionStatus;
import java.util.Calendar;
import ai.elimu.model.gson.BaseEntityGson;

public class ApplicationVersionGson extends BaseEntityGson {
    
    private ApplicationGson application;
    
    private ApplicationVersionStatus applicationVersionStatus;
    
    private Integer fileSizeInKb;
    
    private String fileUrl;
    
    private String checksumMd5;
    
    private String contentType;
    
    private Integer versionCode;
    
    private String versionName;
    
    private String label;
    
    private Integer minSdkVersion;
    
    private String startCommand;
    
    private Calendar timeUploaded;

    public ApplicationGson getApplication() {
        return application;
    }

    public void setApplication(ApplicationGson application) {
        this.application = application;
    }
    
    public ApplicationVersionStatus getApplicationVersionStatus() {
        return applicationVersionStatus;
    }

    public void setApplicationVersionStatus(ApplicationVersionStatus applicationVersionStatus) {
        this.applicationVersionStatus = applicationVersionStatus;
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
    
    public String getChecksumMd5() {
        return checksumMd5;
    }

    public void setChecksumMd5(String checksumMd5) {
        this.checksumMd5 = checksumMd5;
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
    
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
    
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public Integer getMinSdkVersion() {
        return minSdkVersion;
    }

    public void setMinSdkVersion(Integer minSdkVersion) {
        this.minSdkVersion = minSdkVersion;
    }
    
    public String getStartCommand() {
        return startCommand;
    }

    public void setStartCommand(String startCommand) {
        this.startCommand = startCommand;
    }

    public Calendar getTimeUploaded() {
        return timeUploaded;
    }

    public void setTimeUploaded(Calendar timeUploaded) {
        this.timeUploaded = timeUploaded;
    }
}
