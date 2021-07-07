package org.cts.model;

public class AssignBugs {
	private int projectId;
	private String bugAssignedDate;
	private String assignedMember;
	private String assignedBugId;
	
	public AssignBugs() {
		// TODO Auto-generated constructor stub
	}

	public AssignBugs(int projectId, String bugAssignedDate, String assignedMember, String assignedBugId) {
		super();
		this.projectId = projectId;
		this.bugAssignedDate = bugAssignedDate;
		this.assignedMember = assignedMember;
		this.assignedBugId = assignedBugId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getBugAssignedDate() {
		return bugAssignedDate;
	}

	public void setBugAssignedDate(String bugAssignedDate) {
		this.bugAssignedDate = bugAssignedDate;
	}

	public String getAssignedMember() {
		return assignedMember;
	}

	public void setAssignedMember(String assignedMember) {
		this.assignedMember = assignedMember;
	}

	public String getAssignedBugId() {
		return assignedBugId;
	}

	public void setAssignedBugId(String assignedBugId) {
		this.assignedBugId = assignedBugId;
	}
	
	
	

}
