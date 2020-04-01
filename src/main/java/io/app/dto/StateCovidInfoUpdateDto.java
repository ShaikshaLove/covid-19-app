package io.app.dto;

public class StateCovidInfoUpdateDto {
	private int deaths;
	private int numberOfCases;
	private int activeCases;
	private int recovered;
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
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	
	
}
