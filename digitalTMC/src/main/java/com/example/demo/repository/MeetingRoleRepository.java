package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MeetingRole;

@Repository
public interface MeetingRoleRepository extends JpaRepository<MeetingRole, Long> {

}
