package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.sound.SoundType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SoundGson extends ContentGson {

  private String valueIpa;

  private Boolean diacritic;

  private SoundType soundType;

  private String valueSampa;
}
