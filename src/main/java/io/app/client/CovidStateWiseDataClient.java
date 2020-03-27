package io.app.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="state-wise",url="https://script.googleusercontent.com")
public interface CovidStateWiseDataClient {
  @RequestMapping(value="/macros/echo?user_content_key=XmEWaIECh3VOp1aohkbfjDfRwL3VI5imnei94OeaoKQrA91f5HVZCsf67iVDovd5Q9CcfKVeqCVE6HEWHfFEL0vlfNWNBdPXm5_BxDlH2jW0nuo2oDemN9CCS2h10ox_1xSncGQajx_ryfhECjZEnKXFvsR88vL4WiBr168omFadgngDnj25DLpEvLRaiIpzZr1NvbW-Bo38vshdDBv10tpytj_A4aoE&lib=Mm1FD1HVuydJN5yAB3dc_e8h00DPSBbB3")
  public abstract Map<String,Integer> getStateWiseCovidCases();
}
