package com.solix.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solix.demo.entity.PlanEntity;
import com.solix.demo.service.PlanService;

@RestController
@RequestMapping("/api")
public class PlanRESTController {

	@Autowired
	PlanService planService;
	
	@GetMapping(value = "/plans", produces = "application/json")
	public ResponseEntity<List<PlanEntity>> getAllPlans(){
		return new ResponseEntity<>(planService.getAllPlans(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getPlan/{id}", produces = "application/json")
	public ResponseEntity<PlanEntity> getPlanById(@PathVariable String id){
		PlanEntity entity = planService.getPLanById(id);
		
		if(entity == null) {
			return new ResponseEntity<>(entity, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(entity, HttpStatus.OK);
	}
}
