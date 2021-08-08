package pl.radzik.integration.model;



import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "All"
})
@Generated("jsonschema2pojo")
public class All {

    @JsonProperty("All")
    private CovidData covidData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("All")
    public CovidData getAll() {
        return covidData;
    }

    @JsonProperty("All")
    public void setAll(CovidData covidData) {
        this.covidData = covidData;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.covidData == null)? 0 :this.covidData.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof All) == false) {
            return false;
        }
        All rhs = ((All) other);
        return (((this.covidData == rhs.covidData)||((this.covidData != null)&&this.covidData.equals(rhs.covidData)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    @Override
    public String toString() {
        return "CovidData{" +
                "all=" + covidData +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
