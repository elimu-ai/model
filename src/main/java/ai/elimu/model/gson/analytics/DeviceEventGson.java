package ai.elimu.model.gson.analytics;

import java.util.Calendar;
import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.DeviceGson;
import lombok.Getter;
import lombok.Setter;

public abstract class DeviceEventGson extends BaseEntityGson {

    @Getter
    @Setter
    private DeviceGson device;

    @Getter
    @Setter
    private Calendar time;

}
