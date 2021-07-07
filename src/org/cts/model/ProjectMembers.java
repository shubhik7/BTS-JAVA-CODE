package org.cts.model;

public class ProjectMembers {
	private int projectId;
	private String managerName;
	private String memberName;
	private int status;
	
	public ProjectMembers() {
		// TODO Auto-generated constructor stub
	}

	public ProjectMembers(int projectId, String managerName, String memberName, int status) {
		super();
		this.projectId = projectId;
		this.managerName = managerName;
		this.memberName = memberName;
		this.status = status;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

}

