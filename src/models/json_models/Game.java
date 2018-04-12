
package models.json_models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    private List<Integer> size = null;
    private List<Wall> walls = null;
    private Resources resources;
    private List<Building> buildings = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Integer> getSize() {
        return size;
    }

    public void setSize(List<Integer> size) {
        this.size = size;
    }

    public Game withSize(List<Integer> size) {
        this.size = size;
        return this;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public Game withWalls(List<Wall> walls) {
        this.walls = walls;
        return this;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Game withResources(Resources resources) {
        this.resources = resources;
        return this;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public Game withBuildings(List<Building> buildings) {
        this.buildings = buildings;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Game withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
