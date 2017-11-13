package ai.elimu.model.gson.analytics;

import ai.elimu.model.gson.StudentGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import lombok.Getter;
import lombok.Setter;

public class AuthenticationEventGson extends DeviceEventGson {

    @Getter
    @Setter
    private ApplicationGson application;

    @Getter
    @Setter
    private StudentGson student;

    @Getter
    @Setter
    private boolean isFallback;

}
