package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.AudioFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AudioGson extends ContentGson {

  private String title;

  private String transcription;

  private AudioFormat audioFormat;

  private String bytesUrl;

  private Integer bytesSize;

  private Long durationMs;
}
