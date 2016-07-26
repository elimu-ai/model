package org.literacyapp.model.gson.content.multimedia;

import org.literacyapp.model.enums.content.AudioFormat;

public class AudioGson extends MultimediaGson {
    
    private String transcription;
    
    private AudioFormat audioFormat;

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public void setAudioType(AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
    }
}
