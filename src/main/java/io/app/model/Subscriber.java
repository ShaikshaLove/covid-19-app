package io.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscriber {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subscriberId;
	private String fullName;
	private String email;
	private String opinion;
	private boolean active;
	private Date createdDate;
	public int getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Subscriber [subscriberId=" + subscriberId + ", fullName=" + fullName + ", email=" + email + ", opinion="
				+ opinion + ", active=" + active + ", createdDate=" + createdDate + "]";
	}
	public Subscriber() {
		super();
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	
	
	

}
