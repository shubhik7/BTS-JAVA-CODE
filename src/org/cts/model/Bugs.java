package org.cts.model;

public class Bugs {
	
	private String bugName;
	private int projectId;
	private String raisedBy;
	private int priorityId;
	private String bugDesc;
	private String status;
	private String raisedDate;
	
	public Bugs() {
		// TODO Auto-generated constructor stub
	}

	public Bugs(String bugName, int projectId, String raisedBy, int priorityId, String bugDesc,
			String status, String raisedDate) {
		super();
		
		this.bugName = bugName;
		this.projectId = projectId;
		this.raisedBy = raisedBy;
		this.priorityId = priorityId;
		this.bugDesc = bugDesc;
		this.status = status;
		this.raisedDate = raisedDate;
	}

	public String getBugName() {
		return bugName;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	public String getBugDesc() {
		return bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRaisedDate() {
		return raisedDate;
	}

	public void setRaisedDate(String raisedDate) {
		this.raisedDate = raisedDate;
	}
	
	
	
}
