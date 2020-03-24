package io.app.dto;

public class Covid {
  private long cases;
  private long deaths;
  private long recovered;
public long getCases() {
	return cases;
}
public void setCases(long cases) {
	this.cases = cases;
}
public long getDeaths() {
	return deaths;
}
public void setDeaths(long deaths) {
	this.deaths = deaths;
}
public long getRecovered() {
	return recovered;
}
public void setRecovered(long recovered) {
	this.recovered = recovered;
}
@Override
public String toString() {
	return "Covid [cases=" + cases + ", deaths=" + deaths + ", recovered=" + recovered + "]";
}
public Covid() {
	super();
}
public Covid(long cases, long deaths, long recovered) {
	super();
	this.cases = cases;
	this.deaths = deaths;
	this.recovered = recovered;
}
}
