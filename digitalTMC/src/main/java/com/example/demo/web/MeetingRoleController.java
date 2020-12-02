package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MeetingRole;
import com.example.demo.service.MeetingRoleService;

@RestController
public class MeetingRoleController {
	@Autowired
	MeetingRoleService ms;
	@CrossOrigin
	@GetMapping(value = "/meetingroles")
	public List<MeetingRole> retrieveAllMeetingRoles(){
		return ms.retriveAllMeetingRoles();
	}

}
