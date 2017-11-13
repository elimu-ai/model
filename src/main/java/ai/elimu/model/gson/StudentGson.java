package ai.elimu.model.gson;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.List;

public class StudentGson extends BaseEntityGson {

    @Getter
    @Setter
    private String uniqueId; // "<deviceId>_<Long>"

    @Getter
    @Setter
    private Calendar timeCreated; // Time created on Device

    @Getter
    @Setter
    private List<DeviceGson> devices;

    @Getter
    @Setter
    private StudentImageGson avatar;

}
