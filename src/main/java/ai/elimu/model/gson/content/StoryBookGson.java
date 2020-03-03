package ai.elimu.model.gson.content;

import ai.elimu.model.enums.GradeLevel;
import ai.elimu.model.gson.content.multimedia.ImageGson;
import java.util.List;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
public class StoryBookGson extends ContentGson {
    
    private String title;
    
    private String description;
    
    private String attributionUrl;
    
    private ImageGson coverImage;
    
    private GradeLevel gradeLevel;
    
    private List<StoryBookChapterGson> storyBookChapters;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAttributionUrl() {
        return attributionUrl;
    }

    public void setAttributionUrl(String attributionUrl) {
        this.attributionUrl = attributionUrl;
    }
    
    public ImageGson getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(ImageGson coverImage) {
        this.coverImage = coverImage;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public List<StoryBookChapterGson> getStoryBookChapters() {
        return storyBookChapters;
    }

    public void setStoryBookChapters(List<StoryBookChapterGson> storyBookChapters) {
        this.storyBookChapters = storyBookChapters;
    }
}
