package com.newlecture.web.entity;

import java.util.Date;

public class NoticeView extends Notice{
	private String memberName;
	
	public NoticeView() {
		// TODO Auto-generated constructor stub
	}

	public NoticeView(int id, String title, String content, Date regDate, int hit, boolean pub, int memberId, String memberName) {
		super(id, title, content, regDate, hit, pub, memberId);
		
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "NoticeView [memberName=" + memberName + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getRegDate()=" + getRegDate() + ", getHit()=" + getHit()
				+ ", isPub()=" + isPub() + ", getMemberId()=" + getMemberId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
