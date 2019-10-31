package com.varian.ccip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.varian.ccip.client.PatientClient4Feign;
import com.varian.ccip.client.PatientVO;
import com.varian.ccip.model.EncounterVO;
import com.varian.ccip.service.EncounterService;

@RestController
@RequestMapping("encounter")
public class EncounterController {
    @Autowired
    private EncounterService encounterService;
    @Autowired
    private PatientClient4Feign patientClient4Feign;
	
    @GetMapping("search")
	@ResponseBody
	public EncounterVO getEncounterById(@RequestParam("id")Integer id) {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.encounterService.getEncounterById(id);
	}
    
    @GetMapping("search/patient")
	@ResponseBody
	public PatientVO findByPatientSer(@RequestParam("patientSer")Long patientSer) {
		return this.patientClient4Feign.findByPatientSer(patientSer);
	}
}
