package ai.elimu.model.gson.content;

import java.util.List;
import ai.elimu.model.enums.GradeLevel;
import ai.elimu.model.gson.BaseEntityGson;
import ai.elimu.model.gson.content.multimedia.AudioGson;
import ai.elimu.model.gson.content.multimedia.ImageGson;

public class StoryBookPageGson extends BaseEntityGson {
    
    private ImageGson image;
    
    private List<WordGson> words;
    
    private AudioGson audio;

    public ImageGson getImage() {
        return image;
    }

    public void setImage(ImageGson image) {
        this.image = image;
    }

    public List<WordGson> getWords() {
        return words;
    }

    public void setWords(List<WordGson> words) {
        this.words = words;
    }

    public AudioGson getAudio() {
        return audio;
    }

    public void setAudio(AudioGson audio) {
        this.audio = audio;
    }
}
