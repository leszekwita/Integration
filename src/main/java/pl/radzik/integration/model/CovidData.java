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
        "confirmed",
        "recovered",
        "deaths",
        "country",
        "population",
        "sq_km_area",
        "life_expectancy",
        "elevation_in_meters",
        "continent",
        "abbreviation",
        "location",
        "iso",
        "capital_city",
        "lat",
        "long",
        "updated"
})
@Generated("jsonschema2pojo")
public class CovidData {

    @JsonProperty("confirmed")
    private Integer confirmed;
    @JsonProperty("recovered")
    private Integer recovered;
    @JsonProperty("deaths")
    private Integer deaths;
    @JsonProperty("country")
    private String country;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("sq_km_area")
    private Integer sqKmArea;
    @JsonProperty("life_expectancy")
    private String lifeExpectancy;
    @JsonProperty("elevation_in_meters")
    private Integer elevationInMeters;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("location")
    private String location;
    @JsonProperty("iso")
    private Integer iso;
    @JsonProperty("capital_city")
    private String capitalCity;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("long")
    private String _long;
    @JsonProperty("updated")
    private String updated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("confirmed")
    public Integer getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("recovered")
    public Integer getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("deaths")
    public Integer getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("sq_km_area")
    public Integer getSqKmArea() {
        return sqKmArea;
    }

    @JsonProperty("sq_km_area")
    public void setSqKmArea(Integer sqKmArea) {
        this.sqKmArea = sqKmArea;
    }

    @JsonProperty("life_expectancy")
    public String getLifeExpectancy() {
        return lifeExpectancy;
    }

    @JsonProperty("life_expectancy")
    public void setLifeExpectancy(String lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    @JsonProperty("elevation_in_meters")
    public Integer getElevationInMeters() {
        return elevationInMeters;
    }

    @JsonProperty("elevation_in_meters")
    public void setElevationInMeters(Integer elevationInMeters) {
        this.elevationInMeters = elevationInMeters;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("iso")
    public Integer getIso() {
        return iso;
    }

    @JsonProperty("iso")
    public void setIso(Integer iso) {
        this.iso = iso;
    }

    @JsonProperty("capital_city")
    public String getCapitalCity() {
        return capitalCity;
    }

    @JsonProperty("capital_city")
    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("long")
    public String getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(String _long) {
        this._long = _long;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String get_long() {
        return _long;
    }

    public void set_long(String _long) {
        this._long = _long;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.continent == null)? 0 :this.continent.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.iso == null)? 0 :this.iso.hashCode()));
        result = ((result* 31)+((this.capitalCity == null)? 0 :this.capitalCity.hashCode()));
        result = ((result* 31)+((this.abbreviation == null)? 0 :this.abbreviation.hashCode()));
        result = ((result* 31)+((this.confirmed == null)? 0 :this.confirmed.hashCode()));
        result = ((result* 31)+((this.population == null)? 0 :this.population.hashCode()));
        result = ((result* 31)+((this.sqKmArea == null)? 0 :this.sqKmArea.hashCode()));
        result = ((result* 31)+((this.lifeExpectancy == null)? 0 :this.lifeExpectancy.hashCode()));
        result = ((result* 31)+((this.recovered == null)? 0 :this.recovered.hashCode()));
        result = ((result* 31)+((this.elevationInMeters == null)? 0 :this.elevationInMeters.hashCode()));
        result = ((result* 31)+((this._long == null)? 0 :this._long.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
        result = ((result* 31)+((this.deaths == null)? 0 :this.deaths.hashCode()));
        result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CovidData) == false) {
            return false;
        }
        CovidData rhs = ((CovidData) other);
        return ((((((((((((((((((this.continent == rhs.continent)||((this.continent!= null)&&this.continent.equals(rhs.continent)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.iso == rhs.iso)||((this.iso!= null)&&this.iso.equals(rhs.iso))))&&((this.capitalCity == rhs.capitalCity)||((this.capitalCity!= null)&&this.capitalCity.equals(rhs.capitalCity))))&&((this.abbreviation == rhs.abbreviation)||((this.abbreviation!= null)&&this.abbreviation.equals(rhs.abbreviation))))&&((this.confirmed == rhs.confirmed)||((this.confirmed!= null)&&this.confirmed.equals(rhs.confirmed))))&&((this.population == rhs.population)||((this.population!= null)&&this.population.equals(rhs.population))))&&((this.sqKmArea == rhs.sqKmArea)||((this.sqKmArea!= null)&&this.sqKmArea.equals(rhs.sqKmArea))))&&((this.lifeExpectancy == rhs.lifeExpectancy)||((this.lifeExpectancy!= null)&&this.lifeExpectancy.equals(rhs.lifeExpectancy))))&&((this.recovered == rhs.recovered)||((this.recovered!= null)&&this.recovered.equals(rhs.recovered))))&&((this.elevationInMeters == rhs.elevationInMeters)||((this.elevationInMeters!= null)&&this.elevationInMeters.equals(rhs.elevationInMeters))))&&((this._long == rhs._long)||((this._long!= null)&&this._long.equals(rhs._long))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.updated == rhs.updated)||((this.updated!= null)&&this.updated.equals(rhs.updated))))&&((this.deaths == rhs.deaths)||((this.deaths!= null)&&this.deaths.equals(rhs.deaths))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))));
    }

    @Override
    public String toString() {
        return "All{" +
                "confirmed=" + confirmed +
                ", recovered=" + recovered +
                ", deaths=" + deaths +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", sqKmArea=" + sqKmArea +
                ", lifeExpectancy='" + lifeExpectancy + '\'' +
                ", elevationInMeters=" + elevationInMeters +
                ", continent='" + continent + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", location='" + location + '\'' +
                ", iso=" + iso +
                ", capitalCity='" + capitalCity + '\'' +
                ", lat='" + lat + '\'' +
                ", _long='" + _long + '\'' +
                ", updated='" + updated + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

