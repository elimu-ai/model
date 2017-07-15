package ai.elimu.model.gson.analytics;

import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.content.NumeracySkill;
import ai.elimu.model.gson.StudentGson;
import ai.elimu.model.gson.admin.ApplicationGson;
import ai.elimu.model.gson.content.LetterGson;
import ai.elimu.model.gson.content.NumberGson;
import ai.elimu.model.gson.content.WordGson;

@Deprecated
public class UsageEventGson extends DeviceEventGson {

    private ApplicationGson application;
    
    private StudentGson student;
    
    private LiteracySkill literacySkill;
    
    private NumeracySkill numeracySkill;
    
    private LetterGson letter;

    private NumberGson number;

    private WordGson word;

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

    public LetterGson getLetter() {
        return letter;
    }

    public void setLetter(LetterGson letter) {
        this.letter = letter;
    }

    public NumberGson getNumber() {
        return number;
    }

    public void setNumber(NumberGson number) {
        this.number = number;
    }

    public WordGson getWord() {
        return word;
    }

    public void setWord(WordGson word) {
        this.word = word;
    }
}
