package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.VideoFormat;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/model
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VideoGson extends ContentGson {

  private String title;

  private VideoFormat videoFormat;

  private String checksumMd5;

  private String fileUrl;

  private Integer fileSize;

  private String thumbnailUrl;

  private Image posterImage;

  private Set<WordGson> words;
}
