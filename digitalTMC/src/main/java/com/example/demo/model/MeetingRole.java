package com.example.demo.model;

import javax.persistence.*;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class MeetingRole {
	@Id
	@JoinColumn(name ="FK_meetingRoleId")
	private long meetingRoleId;
	private String roleDescription;
	public long getMeetingRoleId() {
		return this.meetingRoleId;
	}
	public void setMeetingRoleId(long meetingRoleId) {
		this.meetingRoleId=meetingRoleId;
	}
	public String getRoleDescription() {
		return this.roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription=roleDescription;
	}

}
