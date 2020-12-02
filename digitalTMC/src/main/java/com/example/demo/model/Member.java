package com.example.demo.model;


import java.util.List;

import javax.persistence.*;

import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String pathways_level;
	@ManyToOne
	@JoinColumn(name ="FK_meetingRoleId")
	private MeetingRole meetingRole;
	private long attendanceNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPathways_level() {
		return pathways_level;
	}
	public void setPathways_level(String pathways_level) {
		this.pathways_level = pathways_level;
	}
	public long getAttendanceNumber() {
		return attendanceNumber;
	}
	public void setAttendanceNumber(long attendanceNumber) {
		this.attendanceNumber = attendanceNumber;
	}
	public MeetingRole getMeetingRole(){
		return this.meetingRole;
	}
	public void setMeetingRole(MeetingRole meetingRole) {
		this.meetingRole=meetingRole;
	}
	
	
}
