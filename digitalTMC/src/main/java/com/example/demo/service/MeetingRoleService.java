package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.MeetingRole;
import com.example.demo.repository.MeetingRoleRepository;

@Configuration
public class MeetingRoleService {
	@Autowired
	MeetingRoleRepository mr;
	public List<MeetingRole> retriveAllMeetingRoles(){
		return mr.findAll();
	}
}
