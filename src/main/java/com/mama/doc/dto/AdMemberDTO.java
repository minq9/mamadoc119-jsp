package com.mama.doc.dto;

public class AdMemberDTO {

//	필드
	private int memberNumber;
	private String memberName;
	private String memberEmail;
	private String memberPassword;
	private String memberNickname;
	private String memberPostCode;
	private String memberAddress;
	private String memberDetailAddress;
	private String memberExtraAddress;
	private String memberJoinDate;
	
//	getter,setter
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getMemberPostCode() {
		return memberPostCode;
	}
	public void setMemberPostCode(String memberPostCode) {
		this.memberPostCode = memberPostCode;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberDetailAddress() {
		return memberDetailAddress;
	}
	public void setMemberDetailAddress(String memberDetailAddress) {
		this.memberDetailAddress = memberDetailAddress;
	}
	public String getMemberExtraAddress() {
		return memberExtraAddress;
	}
	public void setMemberExtraAddress(String memberExtraAddress) {
		this.memberExtraAddress = memberExtraAddress;
	}
	public String getMemberJoinDate() {
		return memberJoinDate;
	}
	public void setMemberJoinDate(String memberJoinDate) {
		this.memberJoinDate = memberJoinDate;
	}
	
	@Override
	public String toString() {
		return "AdMemberDTO [memberNumber=" + memberNumber + ", memberName=" + memberName + ", memberEmail="
				+ memberEmail + ", memberPassword=" + memberPassword + ", memberNickname=" + memberNickname
				+ ", memberPostCode=" + memberPostCode + ", memberAddress=" + memberAddress + ", memberDetailAddress="
				+ memberDetailAddress + ", memberExtraAddress=" + memberExtraAddress + ", memberJoinDate="
				+ memberJoinDate + "]";
	}
	
	
	
	
}


