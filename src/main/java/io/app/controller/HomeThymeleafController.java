package io.app.controller;


import io.app.client.CovidApiClient;
import io.app.client.IndCovidClient;
import io.app.dto.CovidInfo;
import io.app.dto.IndCovid;
import io.app.dto.StateCovdInfDto;
import io.app.model.Counter;
import io.app.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeThymeleafController {

    @Autowired
    private IndCovidClient indCovidClient;

    @Autowired
    private CounterService counterService;

    @Autowired
    private CovidApiClient covidApiClient;

    @GetMapping("/")
    public String home(Model model){
       Counter counter=counterService.updateCount();
        StateCovdInfDto apCovid=indCovidClient.getData().getData().getRegional().get(1);
        model.addAttribute("ap",apCovid);
        System.out.println(apCovid);
        model.addAttribute("covidInfo",covidApiClient.getCovidInfo());
        model.addAttribute("visitorCount",counter.getCount());
        return "home";
    }

}
