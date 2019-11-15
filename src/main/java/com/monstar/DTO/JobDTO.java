package com.monstar.DTO;

public class JobDTO {

	 String jobSkillSet;
	 String jobLocation;
	 String jobEmail;
	
	public String getJobSkillSet() {
		return jobSkillSet;
	}
	public void setJobSkillSet(String jobSkillSet) {
		this.jobSkillSet = jobSkillSet;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getJobEmail() {
		return jobEmail;
	}
	public void setJobEmail(String jobEmail) {
		this.jobEmail = jobEmail;
	}
	@Override
	public String toString() {
		return "JobDTO [jobSkillSet=" + jobSkillSet + ", jobLocation=" + jobLocation + ", jobEmail=" + jobEmail + "]";
	}
	
	
	
}


