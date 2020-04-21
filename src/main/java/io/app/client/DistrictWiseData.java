package io.app.client;

import io.app.dto.State;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="district-wise",url="https://api.covid19india.org")
public interface DistrictWiseData {
    @GetMapping(value="/v2/state_district_wise.jsona")
    public List<State> getDestrictData();
}
