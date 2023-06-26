package com.process.one.model;

public class Asset {
	private String intstrid;
	private String statType;
	private String demoCurrCode;
	private String issueType;
	private String maturityExxpiryTms;
	private String issueSearchText;
	private String nominalValue;
	private String returnCode;
	private String returnDesc;
	public String getIntstrid() {
		return intstrid;
	}
	public void setIntstrid(String intstrid) {
		this.intstrid = intstrid;
	}
	public String getStatType() {
		return statType;
	}
	public void setStatType(String statType) {
		this.statType = statType;
	}
	public String getDemoCurrCode() {
		return demoCurrCode;
	}
	public void setDemoCurrCode(String demoCurrCode) {
		this.demoCurrCode = demoCurrCode;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getMaturityExxpiryTms() {
		return maturityExxpiryTms;
	}
	public void setMaturityExxpiryTms(String maturityExxpiryTms) {
		this.maturityExxpiryTms = maturityExxpiryTms;
	}
	public String getIssueSearchText() {
		return issueSearchText;
	}
	public void setIssueSearchText(String issueSearchText) {
		this.issueSearchText = issueSearchText;
	}
	public String getNominalValue() {
		return nominalValue;
	}
	public void setNominalValue(String nominalValue) {
		this.nominalValue = nominalValue;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnDesc() {
		return returnDesc;
	}
	public void setReturnDesc(String returnDesc) {
		this.returnDesc = returnDesc;
	}
	@Override
	public String toString() {
		return "Asset [intstrid=" + intstrid + ", statType=" + statType + ", demoCurrCode=" + demoCurrCode + "]";
	}
}
