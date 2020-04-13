package io.app.client;

import io.app.dto.IndCovid;
import io.app.dto.IndCovidSummary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="indcovidinfo",url = "https://api.rootnet.in")
public interface IndCovidClient {
    @RequestMapping(value="/covid19-in/stats/letest",method = RequestMethod.GET)
    public IndCovid getData();
}

