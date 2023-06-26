package com.process.one.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name ="FT_T_ISSU" )
	@Entity
	public class FTTIssueBase {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "INSTR_ID")
		private String intstrid;
		@Column(name = "ACTVY_STAT_TYP")
		private String statType;
		@Column(name = "DENOM_CURR_CDE")
		private String demoCurrCode;
		@Column(name = "ISS_TYP")
		private String issueType;
		@Column(name = "MAT_EXP_TMS")
		private String maturityExpiryTms;
		@Column(name = "ISS_ALPH_SRCH_TXT")
		private String issueSearchText;
		@Column(name = "NOM_VAL_UT_AMT")
		private int nominalValue;
		@Column(name = "NOM_VAL_UT_DEC_AMT")
		private double nominalValueDecimal;
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
		public String getMaturityExpiryTms() {
			return maturityExpiryTms;
		}
		public void setMaturityExpiryTms(String maturityExpiryTms) {
			this.maturityExpiryTms = maturityExpiryTms;
		}
		public String getIssueSearchText() {
			return issueSearchText;
		}
		public void setIssueSearchText(String issueSearchText) {
			this.issueSearchText = issueSearchText;
		}
		public int getNominalValue() {
			return nominalValue;
		}
		public void setNominalValue(int nominalValue) {
			this.nominalValue = nominalValue;
		}
		public double getNominalValueDecimal() {
			return nominalValueDecimal;
		}
		public void setNominalValueDecimal(double nominalValueDecimal) {
			this.nominalValueDecimal = nominalValueDecimal;
		}
		@Override
		public String toString() {
			return "FTTIssueBase [intstrid=" + intstrid + ", statType=" + statType + ", demoCurrCode=" + demoCurrCode
					+ ", issueType=" + issueType + ", maturityExpiryTms=" + maturityExpiryTms + ", issueSearchText="
					+ issueSearchText + ", nominalValue=" + nominalValue + ", nominalValueDecimal=" + nominalValueDecimal
					+ ", getIntstrid()=" + getIntstrid() + ", getStatType()=" + getStatType() + ", getDemoCurrCode()="
					+ getDemoCurrCode() + ", getIssueType()=" + getIssueType() + ", getMaturityExpiryTms()="
					+ getMaturityExpiryTms() + ", getIssueSearchText()=" + getIssueSearchText() + ", getNominalValue()="
					+ getNominalValue() + ", getNominalValueDecimal()=" + getNominalValueDecimal() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
			
		
		
	}



