package uk.ac.glasgowerec.domain;

import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.*;

@Entity
@Table(name="reporter")
public class Reporter implements Serializable {
	
	
	private Long id;
	private String mtg;
	private String age;
	private String reporterEmail;
	private String reporterID;
	private String centreId;
	private String reporterName;
	private String uniqueId;
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}
	
	@Column(name = "MTG")
	public String getMtg() {
		return mtg;
	}
	
	@Column(name = "Age")
	public String getAge() {
		return age;
	}
	
	@Column(name = "REPORTER_EMAIL")
	public String getReporterEmail() {
		return reporterEmail;
	}
	
	@Column(name = "REPORTER_ID")
	public String getReporterID() {
		return reporterID;
	}
	
	@Column(name = "CENTRE_ID")
	public String getCentreId() {
		return centreId;
	}
	
	@Column(name = "REPORTER_NAME")
	public String getReporterName() {
		return reporterName;
	}
	
	@Column(name = "CENTRE_NAME")
	public String getCentreName() {
		return centreName;
	}
	
	@Column(name = "UNIQUE_ID")
	public String getUniqueId() {
		
		return uniqueId;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public void setMtg(String mtg) {
		this.mtg = mtg;
	}
	
	
	public void setAge(String age) {
		this.age = age;
	}
	
	
	public void setReporterEmail(String reporterEmail) {
		this.reporterEmail = reporterEmail;
	}
	
	
	public void setReporterID(String reporterID) {
		this.reporterID = reporterID;
	}
	
	
	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}
	
	
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}
	
	
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}
	
	public void setUniqueId( String uniqueId) {
		
		this.uniqueId = uniqueId;
	}
	
	@Override
	public String toString() {
		return "Reporter [id=" + id + ", mtg=" + mtg + ", age=" + age + ", reporterEmail=" + reporterEmail
				+ ", reporterID=" + reporterID + ", centreId=" + centreId + ", reporterName=" + reporterName
				+ ", uniqueId=" + uniqueId + ", centreName=" + centreName + "]";
	}
	private String centreName;
	
	
	
	
	
	
	/*
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}
	
	@Column(name = "MTG")
	public String getMTG() {
		return MTG;
	}
	
	@Column(name = "Age")
	public String getAge() {
		return Age;
	}
	
	@Column(name = "Reporter_Email")
	public String getReporterEmail() {
		return ReporterEmail;
	}
	
	@Column(name = "Reporter_ID")
	public String getReporterID() {
		return ReporterID;
	}
	
	@Column(name = "Centre_ID")
	public String getCentreID() {
		return CentreID;
	}
	
	@Column(name = "Reporter_Name")
	public String getReporterName() {
		return Reporter_Name;
	}
	
	@Column(name = "Centre_Name")
	public String getCentreName() {
		return CentreName;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setMTG(String mTG) {
		MTG = mTG;
	}
	public void setAge(String age) {
		Age = age;
	}
	public void setReporterEmail(String reporterEmail) {
		ReporterEmail = reporterEmail;
	}
	public void setReporterID(String reporterID) {
		ReporterID = reporterID;
	}
	public void setCentreID(String centreID) {
		CentreID = centreID;
	}
	public void setReporterName(String reporterName) {
		Reporter_Name = reporterName;
	}
	public void setCentreName(String centreName) {
		CentreName = centreName;
	}
	
	@Override
	public String toString() {
		return "Reporter [id=" + id + ", MTG=" + MTG + ", Age=" + Age + ", ReporterEmail=" + ReporterEmail
				+ ", ReporterID=" + ReporterID + ", CentreID=" + CentreID + ", ReporterName=" + Reporter_Name
				+ ", CentreName=" + CentreName + "]";
	}
	
	
	*/
	
	
	
	

}
