package com.app.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.abhi.entity.CitizensEntity;

public interface CitizenplanRepository extends JpaRepository<CitizensEntity, Integer> {

}
