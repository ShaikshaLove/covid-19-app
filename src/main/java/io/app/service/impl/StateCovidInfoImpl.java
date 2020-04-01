package io.app.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.app.dto.StateCovidInfoDto;
import io.app.dto.StateCovidInfoUpdateDto;
import io.app.model.StateCovidInfo;
import io.app.repository.StateCovidInfoRepository;
import io.app.service.IStateCovidInfoService;
@Service
public class StateCovidInfoImpl implements IStateCovidInfoService {
	
	@Autowired
	private StateCovidInfoRepository stateCovidInfoRepository;

	@Override
	public StateCovidInfo save(StateCovidInfoDto stateCovidInfoDto) {
		StateCovidInfo stateCovidInfo=new StateCovidInfo();
		stateCovidInfo.setRecovered(stateCovidInfoDto.getRecovered());
		stateCovidInfo.setCreatedDate(new Date());
		stateCovidInfo.setStateName(stateCovidInfoDto.getStateName());;
		stateCovidInfo.setActiveCases(stateCovidInfoDto.getActiveCases());
		stateCovidInfo.setDeaths(stateCovidInfoDto.getDeaths());
		stateCovidInfo.setNumberOfCases(stateCovidInfoDto.getNumberOfCases());
		return stateCovidInfoRepository.save(stateCovidInfo);
	}

	@Override
	public StateCovidInfo update(int id,StateCovidInfoUpdateDto stateCovidInfoUpdateDto) {
		StateCovidInfo stateCovidInfo=getById(id);
		stateCovidInfo.setUpdateDate(new Date());
		stateCovidInfo.setRecovered(stateCovidInfoUpdateDto.getRecovered());
		stateCovidInfo.setActiveCases(stateCovidInfoUpdateDto.getActiveCases());
		stateCovidInfo.setDeaths(stateCovidInfoUpdateDto.getDeaths());
		stateCovidInfo.setNumberOfCases(stateCovidInfoUpdateDto.getNumberOfCases());	
		return stateCovidInfoRepository.save(stateCovidInfo);
	}

	@Override
	public StateCovidInfo getById(int id) {
		return stateCovidInfoRepository.findById(id).orElseThrow(()-> new RuntimeException("No state data is found"));
	}

	@Override
	public StateCovidInfo getBySateName(String name) {
		return stateCovidInfoRepository.findByStateName(name);
	}

	@Override
	public List<StateCovidInfo> getAllStateCovidInfo() {
		return stateCovidInfoRepository.findAll();
	}

}
