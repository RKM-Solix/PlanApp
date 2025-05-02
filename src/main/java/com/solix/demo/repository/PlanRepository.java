package com.solix.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solix.demo.entity.PlanEntity;

public interface PlanRepository extends JpaRepository<PlanEntity, String> {

}
