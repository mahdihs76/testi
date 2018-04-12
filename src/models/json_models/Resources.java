
package models.json_models;

import java.util.HashMap;
import java.util.Map;

public class Resources {

    private Integer gold;
    private Integer elixir;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Resources withGold(Integer gold) {
        this.gold = gold;
        return this;
    }

    public Integer getElixir() {
        return elixir;
    }

    public void setElixir(Integer elixir) {
        this.elixir = elixir;
    }

    public Resources withElixir(Integer elixir) {
        this.elixir = elixir;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Resources withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
