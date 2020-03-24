package io.app.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.app.dto.Covid;
import io.app.dto.CovidInfo;

@FeignClient(name="covid-info",url="https://coronavirus-19-api.herokuapp.com")
public interface CovidApiClient {
     
	 @GetMapping("/all")
	 public abstract Covid all();
	 
	 @GetMapping("/countries/india")
	 public CovidInfo getCovidInfo();
}
