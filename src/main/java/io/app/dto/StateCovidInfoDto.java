package io.app.dto;

public class StateCovidInfoDto {
	private String stateName;
	private int deaths;
	private int numberOfCases;
	private int activeCases;
	private int recovered;
	
	
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getNumberOfCases() {
		return numberOfCases;
	}
	public void setNumberOfCases(int numberOfCases) {
		this.numberOfCases = numberOfCases;
	}
	public int getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(int activeCases) {
		this.activeCases = activeCases;
	}
	public StateCovidInfoDto(String stateName, int deaths, int numberOfCases, int activeCases) {
		super();
		this.stateName = stateName;
		this.deaths = deaths;
		this.numberOfCases = numberOfCases;
		this.activeCases = activeCases;
	}
	@Override
	public String toString() {
		return "StateCovidInfoDto [stateName=" + stateName + ", deaths=" + deaths + ", numberOfCases=" + numberOfCases
				+ ", activeCases=" + activeCases + "]";
	}
	
	
}
