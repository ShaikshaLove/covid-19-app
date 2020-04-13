package io.app.dto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class IndCovid {
    private boolean success;
    private IndCovidData data;
    private Date lastRefreshed;
    private Date lastOriginUpdate;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public IndCovidData getData() {
        return data;
    }

    public void setData(IndCovidData data) {
        this.data = data;
    }

    public Date getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(Date lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public Date getLastOriginUpdate() {
        return lastOriginUpdate;
    }

    public void setLastOriginUpdate(Date lastOriginUpdate) {
        this.lastOriginUpdate = lastOriginUpdate;
    }

    public IndCovid() {
    }
}
