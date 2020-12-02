package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Member;


@Repository
public interface MemberRepository extends JpaRepository <Member, Long> {
	public Member getMemberById(long id);
	public Member getMemberByName(String name);
}
