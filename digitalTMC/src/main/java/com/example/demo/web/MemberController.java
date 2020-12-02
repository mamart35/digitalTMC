package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	MemberService ms;
	@GetMapping(value = "/member/{id}")
	@ResponseBody
	public Member getMember(@PathVariable(value = "id") long id) {
		return ms.getMemberByID(id);
	}
	@CrossOrigin
	@PutMapping(value ="/member")
	public Member updateMember(@RequestBody Member newMember) {
		return ms.updateMember(newMember);
	}
}
