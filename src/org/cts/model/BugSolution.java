package org.cts.model;

public class BugSolution {
	private String bugId;
	private String solvedData;
	private String solutionDetails;
	
	public BugSolution() {
		// TODO Auto-generated constructor stub
	}
	
	public BugSolution(String bugId, String solvedData, String solutionDetails) {
		super();
		this.bugId = bugId;
		this.solvedData = solvedData;
		this.solutionDetails = solutionDetails;
	}

	public String getBugId() {
		return bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId;
	}

	public String getSolvedDate() {
		return solvedData;
	}

	public void setSolvedDate(String solvedData) {
		this.solvedData = solvedData;
	}

	public String getSolutionDetails() {
		return solutionDetails;
	}

	public void setSolutionDetails(String solutionDetails) {
		this.solutionDetails = solutionDetails;
	}
	
	

}
