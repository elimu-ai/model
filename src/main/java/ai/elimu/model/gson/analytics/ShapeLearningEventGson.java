package ai.elimu.model.gson.analytics;

import ai.elimu.model.enums.content.Shape;

public class ShapeLearningEventGson extends LearningEventGson {

    private Shape shape;
    
    // TODO: activityType?

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
