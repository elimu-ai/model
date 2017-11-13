package ai.elimu.model.gson.admin;

import java.util.Calendar;
import ai.elimu.model.gson.BaseEntityGson;
import lombok.Getter;
import lombok.Setter;

public class ApplicationVersionGson extends BaseEntityGson {

    @Getter
    @Setter
    private ApplicationGson application;

    @Getter
    @Setter
    private Integer fileSizeInKb;

    @Getter
    @Setter
    private String fileUrl;

    @Getter
    @Setter
    private String contentType;

    @Getter
    @Setter
    private Integer versionCode;

    @Getter
    @Setter
    private String startCommand;

    @Getter
    @Setter
    private Calendar timeUploaded;

}
