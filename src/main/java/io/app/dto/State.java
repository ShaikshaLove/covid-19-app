package io.app.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class State {
    private String state;
    private List<District> districtData;

    public String getState() {
        return state;
    }

    public State() {
    }

    @Override
    public String toString() {
        return "State{" +
                "state='" + state + '\'' +
                ", districtData=" + districtData +
                '}';
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<District> getDistrictData() {
        return districtData;
    }

    public void setDistrictData(List<District> districtData) {
        this.districtData = districtData;
    }
}

