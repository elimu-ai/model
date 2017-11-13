package ai.elimu.model.gson.content;

import ai.elimu.model.enums.content.allophone.ConsonantPlace;
import ai.elimu.model.enums.content.allophone.ConsonantType;
import ai.elimu.model.enums.content.allophone.ConsonantVoicing;
import ai.elimu.model.enums.content.allophone.LipRounding;
import ai.elimu.model.enums.content.allophone.SoundType;
import ai.elimu.model.enums.content.allophone.VowelFrontness;
import ai.elimu.model.enums.content.allophone.VowelHeight;
import ai.elimu.model.enums.content.allophone.VowelLength;
import ai.elimu.model.gson.content.multimedia.AudioGson;
import lombok.Getter;
import lombok.Setter;

public class AllophoneGson extends ContentGson {

    @Getter
    @Setter
    private String valueIpa; // IPA - International Phonetic Alphabet

    @Getter
    @Setter
    private String valueSampa; // X-SAMPA - Extended Speech Assessment Methods Phonetic Alphabet

    @Getter
    @Setter
    private AudioGson audio;

    @Getter
    @Setter
    private boolean diacritic;

    @Getter
    @Setter
    private SoundType soundType;

    @Getter
    @Setter
    private VowelLength vowelLength;

    @Getter
    @Setter
    private VowelHeight vowelHeight;

    @Getter
    @Setter
    private VowelFrontness vowelFrontness;

    @Getter
    @Setter
    private LipRounding lipRounding;

    @Getter
    @Setter
    private ConsonantType consonantType;

    @Getter
    @Setter
    private ConsonantPlace consonantPlace;

    @Getter
    @Setter
    private ConsonantVoicing consonantVoicing;

    @Getter
    @Setter
    private int usageCount; // Based on StoryBook content

}
