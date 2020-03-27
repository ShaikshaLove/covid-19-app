package io.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.mail.MailSendException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.mail.util.MailConnectException;

import io.app.client.CovidApiClient;
import io.app.client.CovidStateWiseDataClient;
import io.app.dto.Covid;
import io.app.dto.CovidInfo;
import io.app.event.SubscriberCreatedEvent;
import io.app.model.Subscriber;
import io.app.service.ISubscriberService;

@Controller
public class SubscriberController {
	@Autowired
	private CovidApiClient apiClient;
	@Autowired
	private ISubscriberService subscriberService;
	
	@Autowired
	private ApplicationEventPublisher eventPubisher;
	

	@Autowired
	private CovidStateWiseDataClient apiStateWiseCovidData;
	
	@RequestMapping(method = RequestMethod.POST,value="/subscribe")
	public String save(@ModelAttribute Subscriber subscriber,ModelMap modelMap) {
		 subscriberService.save(subscriber);
		 Covid covid= apiClient.all();
		 CovidInfo covidInfo=apiClient.getCovidInfo();
		 modelMap.put("covid",covid);
		 modelMap.put("covidInfo",covidInfo);
		 modelMap.put("message","A great appreciation for the subscription in receiving news letters about covid-19 via email");
		 modelMap.put("subscriber",new Subscriber());
		 modelMap.put("AP",apiStateWiseCovidData.getStateWiseCovidCases().get("Andhra Pradesh"));
		 modelMap.put("TS",apiStateWiseCovidData.getStateWiseCovidCases().get("Telengana"));
		 return "home";
	}
	
	@RequestMapping(value="subscribers",method=RequestMethod.GET)
	@ResponseBody
	public List<Subscriber> all(){
		return subscriberService.all();
	}
	
	@ExceptionHandler({MailSendException.class,MailConnectException.class})
	public String handle(ModelMap modelMap) {
		 Covid covid= apiClient.all();
		 CovidInfo covidInfo=apiClient.getCovidInfo();
		 modelMap.put("covid",covid);
		 modelMap.put("covidInfo",covidInfo);
		 modelMap.put("message","Thanks for your subscription in getting covid-19 news letters via email");
		 modelMap.put("subscriber",new Subscriber());
		 return "home";
	}

}
