package io.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.app.client.CovidApiClient;
import io.app.dto.Covid;
import io.app.dto.CovidInfo;
import io.app.model.Subscriber;

@Controller
public class HomeController {
	private static final Logger LOG=LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private CovidApiClient apiClient;
	
	@RequestMapping(value= {"/","home"},method=RequestMethod.GET)
	public String home(ModelMap modelMap) {
		 Covid covid= apiClient.all();
		 CovidInfo covidInfo=apiClient.getCovidInfo();
		 LOG.debug("All covid data"+covid);
		 LOG.debug("All covid data"+covidInfo);
		 modelMap.put("covid",covid);
		 modelMap.put("covidInfo",covidInfo);
		
		 modelMap.put("subscriber",new Subscriber());

		 modelMap.put("message",null);
		return "home";
	}

}
