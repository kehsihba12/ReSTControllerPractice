package com.app.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.abhi.entity.Employee;

public interface MyRepositoty extends JpaRepository<Employee, Integer> {

}
