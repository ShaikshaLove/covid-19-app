package io.app.dto;

public class StateCovdInfDto {

    private String loc;
    private long confirmedCasesIndian;
    private long discharged;
    private long deaths;
    private long confirmedCasesForeign;
    private long totalConfirmed;

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public long getConfirmedCasesIndian() {
        return confirmedCasesIndian;
    }

    public void setConfirmedCasesIndian(long confirmedCasesIndian) {
        this.confirmedCasesIndian = confirmedCasesIndian;
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

    public long getConfirmedCasesForeign() {
        return confirmedCasesForeign;
    }

    public void setConfirmedCasesForeign(long confirmedCasesForeign) {
        this.confirmedCasesForeign = confirmedCasesForeign;
    }

    public long getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(long totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    @Override
    public String toString() {
        return "StateCovdinfDto{" +
                "loc='" + loc + '\'' +
                ", confirmedCasesIndian=" + confirmedCasesIndian +
                ", discharged=" + discharged +
                ", deaths=" + deaths +
                ", confirmedCasesForeign=" + confirmedCasesForeign +
                ", totalConfirmed=" + totalConfirmed +
                '}';
    }

    public StateCovdInfDto() {
    }
}
