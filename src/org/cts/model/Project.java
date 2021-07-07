
package org.cts.model;


public class Project {
	private int projectId;
	private String  projectName;
	private String startDate;
	private String endDate;
	private String status;
	private String assignedManagerId;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName, String startDate, String endDate, String status,
			String assignedManagerId) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate =startDate;
		this.endDate = endDate;
		this.status = status;
		this.assignedManagerId = assignedManagerId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate =startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssignedManagerId() {
		return assignedManagerId;
	}

	public void setAssignedManagerId(String assignedManagerId) {
		this.assignedManagerId = assignedManagerId;
	}
	
	

}