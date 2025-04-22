package ai.elimu.model.v2.gson.application;

import ai.elimu.model.v2.gson.BaseEntityGson;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionGson extends BaseEntityGson {

  private String fileUrl;

  private Integer fileSizeInKb;

  private String checksumMd5;

  private Integer versionCode;
}
