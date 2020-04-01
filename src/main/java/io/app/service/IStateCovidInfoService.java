package io.app.service;

import java.util.List;

import io.app.dto.StateCovidInfoDto;
import io.app.dto.StateCovidInfoUpdateDto;
import io.app.model.StateCovidInfo;

public interface IStateCovidInfoService {
   public StateCovidInfo save(StateCovidInfoDto stateCovidInfoDto);
   public StateCovidInfo update(int id,StateCovidInfoUpdateDto stateCovidInfoUpdateDto);
   public StateCovidInfo getById(int id);
   public StateCovidInfo getBySateName(String name);
   public List<StateCovidInfo> getAllStateCovidInfo();
}
