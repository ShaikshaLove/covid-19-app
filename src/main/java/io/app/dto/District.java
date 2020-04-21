package io.app.dto;

import java.util.Date;

public class District {
    private long confirmed;
    private Date lastupdatedtime;
    private String district;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(long confirmed) {
        this.confirmed = confirmed;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public District() {
    }

    @Override
    public String toString() {
        return "District{" +
                "confirmed=" + confirmed +
                ", lastupdatedtime=" + lastupdatedtime +
                ", district='" + district + '\'' +
                '}';
    }
}
