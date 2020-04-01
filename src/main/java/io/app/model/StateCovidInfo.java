package io.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class StateCovidInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String stateName;
	private int deaths;
	private int numberOfCases;
	private int activeCases;
	@Temporal(TemporalType.DATE)
	private Date updateDate;
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	
	private int recovered;
	
	
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public int getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(int activeCases) {
		this.activeCases = activeCases;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	

	@Override
	public String toString() {
		return "StateCovidInfo [id=" + id + ", stateName=" + stateName + ", deaths=" + deaths + ", numberOfCases="
				+ numberOfCases + ", activeCases=" + activeCases + ", updateDate=" + updateDate + ", createdDate="
				+ createdDate + ", recovered=" + recovered + "]";
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	 
	 

}
