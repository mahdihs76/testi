
package models.json_models;

import java.util.HashMap;
import java.util.Map;

public class Wall {

    private Integer level;

    private Integer y2;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Wall withLevel(Integer level) {
        this.level = level;
        return this;
    }

//    public Integer getX() {
//        return x;
//    }

//    public void setX(Integer x) {
//        this.x = x;
//    }

    public Wall withX(Integer x) {
//        this.x = x;
        return this;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }

    public Wall withY(Integer y) {
        this.y2 = y;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Wall withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
