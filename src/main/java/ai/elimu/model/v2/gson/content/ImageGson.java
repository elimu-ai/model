package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.ImageFormat;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Based on https://github.com/elimu-ai/webapp/blob/2cc87f2150643b77f0a9cd2f2780f73176163a4d/src/main/java/ai/elimu/entity/content/multimedia/Image.java#L4
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageGson extends ContentGson {

  private String title;

  private ImageFormat imageFormat;

  /**
   * The dominant color of the image, stored in RGB format. E.g. "135,134,115"
   */
  private String dominantColor;

  private String checksumMd5;

  private String fileUrl;

  private Integer fileSize;

  private Set<WordGson> words;
}
