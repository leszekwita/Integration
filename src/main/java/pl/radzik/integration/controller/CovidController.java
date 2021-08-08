package pl.radzik.integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import pl.radzik.integration.model.CovidData;

@Controller
public class CovidController {

    private  static final String URL = "https://covid-api.mmediagroup.fr/v1/cases?country=Poland";

    @GetMapping("/covid")
    public String get(Model model) {
        model.addAttribute("covidStatistic", getCovidStatistic());
        return "covid";
    }

    private CovidData getCovidStatistic() {
        RestTemplate restTemplate = new RestTemplate();
        CovidData forObject = restTemplate.getForObject(URL, CovidData.class);
        return forObject;
    }

}

