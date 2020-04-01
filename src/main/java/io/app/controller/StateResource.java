package io.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.app.dto.StateCovidInfoDto;
import io.app.dto.StateCovidInfoUpdateDto;
import io.app.model.StateCovidInfo;
import io.app.service.IStateCovidInfoService;

@RestController
@RequestMapping(value="/states")
public class StateResource {
	
	@Autowired
	private IStateCovidInfoService stateCovidInfoService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE )
	public StateCovidInfo save(@RequestBody  StateCovidInfoDto stateCovidInfoDto) {
		return stateCovidInfoService.save(stateCovidInfoDto);
		 
	}
	
	@GetMapping(produces =MediaType.APPLICATION_JSON_VALUE )
	public List<StateCovidInfo> all(){
		return stateCovidInfoService.getAllStateCovidInfo();
	}
	
	@PutMapping(value="/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE )
	public StateCovidInfo update(@PathVariable("id")int id,@RequestBody  StateCovidInfoUpdateDto stateCovidInfoUpdateDto) {
		return stateCovidInfoService.update(id,stateCovidInfoUpdateDto);
	}
	

}
