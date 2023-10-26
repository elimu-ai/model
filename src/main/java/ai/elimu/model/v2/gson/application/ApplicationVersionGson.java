package ai.elimu.model.v2.gson.application;

import ai.elimu.model.v2.gson.BaseEntityGson;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
public class ApplicationVersionGson extends BaseEntityGson {
    
    private String fileUrl;
    
    private Integer fileSizeInKb;
    
    private String checksumMd5;
    
    private Integer versionCode;

    public String getChecksumMd5() {
        return checksumMd5;
    }

    public Integer getFileSizeInKb() {
        return fileSizeInKb;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setChecksumMd5(String checksumMd5) {
        this.checksumMd5 = checksumMd5;
    }

    public void setFileSizeInKb(Integer fileSizeInKb) {
        this.fileSizeInKb = fileSizeInKb;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }
}
