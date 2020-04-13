package io.app.dto;

import java.util.ArrayList;

public class IndCovidData {
    private ArrayList<StateCovdInfDto> regional=new ArrayList<>();
    private IndCovidSummary summary;

    public ArrayList<StateCovdInfDto> getRegional() {
        return regional;
    }

    public void setRegional(ArrayList<StateCovdInfDto> regional) {
        this.regional = regional;
    }

    public IndCovidSummary getSummary() {
        return summary;
    }

    public void setSummary(IndCovidSummary summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "IndCovidData{" +
                "regional=" + regional +
                ", summary=" + summary +
                '}';
    }

    public IndCovidData() {
    }
}
