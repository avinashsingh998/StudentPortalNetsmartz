package com.avi.studentsPortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	Long acc_No;
	
	@Column(nullable = false)
	String acc_holderName;
	
	@Column(nullable = false)
	String bankName;
	
	String acc_Type;
	
	String IFSC_Code;

	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Long acc_No, String acc_holderName, String bankName, String acc_Type, String iFSC_Code) {
		super();
		this.acc_No = acc_No;
		this.acc_holderName = acc_holderName;
		this.bankName = bankName;
		this.acc_Type = acc_Type;
		IFSC_Code = iFSC_Code;
	}

	public Long getAcc_No() {
		return acc_No;
	}

	public void setAcc_No(Long acc_No) {
		this.acc_No = acc_No;
	}

	public String getAcc_holderName() {
		return acc_holderName;
	}

	public void setAcc_holderName(String acc_holderName) {
		this.acc_holderName = acc_holderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAcc_Type() {
		return acc_Type;
	}

	public void setAcc_Type(String acc_Type) {
		this.acc_Type = acc_Type;
	}

	public String getIFSC_Code() {
		return IFSC_Code;
	}

	public void setIFSC_Code(String iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}

	@Override
	public String toString() {
		return "Account [acc_No=" + acc_No + ", acc_holderName=" + acc_holderName + ", bankName=" + bankName
				+ ", acc_Type=" + acc_Type + ", IFSC_Code=" + IFSC_Code + "]";
	}
	
	

}
