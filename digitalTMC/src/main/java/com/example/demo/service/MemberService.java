package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;

@Configuration
public class MemberService {
	@Autowired
	MemberRepository mr;
	public Member getMemberByID (long id) {
		return mr.getMemberById(id);
	}
}
