package org.literacyapp.model.gson.analytics;

import org.literacyapp.model.enums.content.LiteracySkill;
import org.literacyapp.model.enums.content.NumeracySkill;
import org.literacyapp.model.gson.StudentGson;
import org.literacyapp.model.gson.admin.ApplicationGson;

public class UsageEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;
    
    private LiteracySkill literacySkill;
    
    private NumeracySkill numeracySkill;

    public ApplicationGson getApplication() {
        return application;
    }

    public void setApplication(ApplicationGson application) {
        this.application = application;
    }

    public StudentGson getStudent() {
        return student;
    }

    public void setStudent(StudentGson student) {
        this.student = student;
    }

    public LiteracySkill getLiteracySkill() {
        return literacySkill;
    }

    public void setLiteracySkill(LiteracySkill literacySkill) {
        this.literacySkill = literacySkill;
    }

    public NumeracySkill getNumeracySkill() {
        return numeracySkill;
    }

    public void setNumeracySkill(NumeracySkill numeracySkill) {
        this.numeracySkill = numeracySkill;
    }
}
