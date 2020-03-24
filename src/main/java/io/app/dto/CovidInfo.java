package io.app.dto;

public class CovidInfo {
	private String country;
	private long cases;
	private long todayCases;
	private long deaths;
	private long todayDeaths;
	private long recovered;
	private long active;
	private long critical;
	private long casesPerOneMillion;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getCases() {
		return cases;
	}
	public void setCases(long cases) {
		this.cases = cases;
	}
	public long getTodayCases() {
		return todayCases;
	}
	public void setTodayCases(long todayCases) {
		this.todayCases = todayCases;
	}
	public long getDeaths() {
		return deaths;
	}
	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}
	public long getTodayDeaths() {
		return todayDeaths;
	}
	public void setTodayDeaths(long todayDeaths) {
		this.todayDeaths = todayDeaths;
	}
	public long getRecovered() {
		return recovered;
	}
	public void setRecovered(long recovered) {
		this.recovered = recovered;
	}
	public long getActive() {
		return active;
	}
	public void setActive(long active) {
		this.active = active;
	}
	public long getCritical() {
		return critical;
	}
	public void setCritical(long critical) {
		this.critical = critical;
	}
	public long getCasesPerOneMillion() {
		return casesPerOneMillion;
	}
	public void setCasesPerOneMillion(long casesPerOneMillion) {
		this.casesPerOneMillion = casesPerOneMillion;
	}
	public CovidInfo() {
		super();
	}
	@Override
	public String toString() {
		return "CovidInfo [country=" + country + ", cases=" + cases + ", todayCases=" + todayCases + ", deaths="
				+ deaths + ", todayDeaths=" + todayDeaths + ", recovered=" + recovered + ", active=" + active
				+ ", critical=" + critical + ", casesPerOneMillion=" + casesPerOneMillion + "]";
	}
}
