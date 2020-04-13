package io.app.controller;

import io.app.client.IndCovidClient;
import io.app.dto.IndCovid;
import io.app.dto.IndCovidSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.app.client.CovidApiClient;
import io.app.dto.Covid;
import io.app.dto.CovidInfo;
import io.app.model.StateCovidInfo;
import io.app.model.Subscriber;
import io.app.service.IStateCovidInfoService;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class HomeController {
	private static final Logger LOG=LoggerFactory.getLogger(HomeController.class);
	@Autowired	
	private CovidApiClient apiClient;
	
	@Autowired
	private IStateCovidInfoService stateCovidInfoService;

	@Autowired
	private IndCovidClient indCovidClient;
	
	
	/*
	 * @Autowired private CovidStateWiseDataClient apiStateWiseCovidData;
	 */
	
	@RequestMapping(value= {"/","home"},method=RequestMethod.GET)
	public String home(ModelMap modelMap) {
		 Covid covid= apiClient.all();
		 CovidInfo covidInfo=apiClient.getCovidInfo();
		 LOG.debug("All covid data"+covid);
		 LOG.debug("All covid data"+covidInfo);
		 modelMap.put("covid",covid);
		 modelMap.put("covidInfo",covidInfo);
		 modelMap.put("AP",indCovidClient.getData().getData().getRegional().get(0));
//		 modelMap.put("TS",stateCovidInfoService.getBySateName("Telengana"));

		/*
		 * modelMap.put("AP",apiStateWiseCovidData.getStateWiseCovidCases().
		 * get("Andhra Pradesh"));
		 * modelMap.put("TS",apiStateWiseCovidData.getStateWiseCovidCases().get(
		 * "Telengana"));
		 */

		 modelMap.put("subscriber",new Subscriber());

		 modelMap.put("message",null);
		return "home";
	}
	
	/*
	 * @RequestMapping("/data")
	 * 
	 * @ResponseBody public Map<String,Integer> data(){ return
	 * apiStateWiseCovidData.getStateWiseCovidCases(); }
	 */


	@GetMapping("/test")
	@ResponseBody
	public IndCovid data(){
		return indCovidClient.getData();
	}
}
