package io.app.controller;


import io.app.client.CovidApiClient;
import io.app.client.IndCovidClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeThymeleafController {

    @Autowired
    private IndCovidClient indCovidClient;

    @Autowired
    private CovidApiClient covidApiClient;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("ap",indCovidClient.getData().getData().getRegional().get(0));
        model.addAttribute("covidInfo",covidApiClient.getCovidInfo());
        return "home";
    }

}
