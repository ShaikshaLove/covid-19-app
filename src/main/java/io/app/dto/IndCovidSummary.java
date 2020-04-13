package io.app.dto;

public class IndCovidSummary {
    private long total;
    private long confirmedCasesIndian;
    private long confirmedCasesForeign;
    private long discharged;
    private long deaths;
    private long confirmedButLocationUnidentified;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getConfirmedCasesIndian() {
        return confirmedCasesIndian;
    }

    public void setConfirmedCasesIndian(long confirmedCasesIndian) {
        this.confirmedCasesIndian = confirmedCasesIndian;
    }

    public long getConfirmedCasesForeign() {
        return confirmedCasesForeign;
    }

    public void setConfirmedCasesForeign(long confirmedCasesForeign) {
        this.confirmedCasesForeign = confirmedCasesForeign;
    }

    public long getDischarged() {
        return discharged;
    }

    public void setDischarged(long discharged) {
        this.discharged = discharged;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getConfirmedButLocationUnidentified() {
        return confirmedButLocationUnidentified;
    }

    public void setConfirmedButLocationUnidentified(long confirmedButLocationUnidentified) {
        this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
    }

    public IndCovidSummary() {
    }
}
