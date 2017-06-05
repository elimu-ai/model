package org.literacyapp.model.gson.content;

import java.util.List;
import org.literacyapp.model.enums.GradeLevel;
import org.literacyapp.model.gson.BaseEntityGson;
import org.literacyapp.model.gson.content.multimedia.AudioGson;
import org.literacyapp.model.gson.content.multimedia.ImageGson;

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
