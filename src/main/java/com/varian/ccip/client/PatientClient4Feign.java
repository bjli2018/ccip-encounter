package com.varian.ccip.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "CCIP-PATIENT")
public interface PatientClient4Feign {
	@RequestMapping(method = RequestMethod.GET,
            value = "/patient/search",
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public PatientVO findByPatientSer(@RequestParam("patientSer")Long patientSer);
}
