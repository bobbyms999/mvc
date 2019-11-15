package com.monstar.BO;

public class JobBO {

	private int jobCode;
	private String jobSkillSet;
	private String jobType;
	private String jobLocation;
	private String jobEmail;

	public JobBO(int jobCode, String jobSkillSet, String jobType, String jobLocation, String jobEmail) {
		this.jobCode = jobCode;
		this.jobSkillSet = jobSkillSet;
		this.jobType = jobType;
		this.jobLocation = jobLocation;
		this.jobEmail = jobEmail;
	}

	public int getJobCode() {
		return jobCode;
	}

	public void setJobCode(int jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobSkillSet() {
		return jobSkillSet;
	}

	public void setJobSkillSet(String jobSkillSet) {
		this.jobSkillSet = jobSkillSet;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
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
		return "JobDTO [jobCode=" + jobCode + ", jobSkillSet=" + jobSkillSet + ", jobType=" + jobType + ", jobLocation="
				+ jobLocation + ", jobEmail=" + jobEmail + "]";
	}

}
