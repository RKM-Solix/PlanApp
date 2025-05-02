package com.solix.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solix.demo.entity.PlanEntity;
import com.solix.demo.repository.PlanRepository;

@Service
public class PlanService {

	@Autowired
	PlanRepository planRepository;

	public List<PlanEntity> getAllPlans() {
		
		return planRepository.findAll();
	}

	public PlanEntity getPLanById(String id) {

		Optional<PlanEntity> entity = planRepository.findById(id);
		
		if(entity.isPresent())
			return entity.get();
		
		return null;
	}
}
