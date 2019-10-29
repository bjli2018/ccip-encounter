package com.varian.ccip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.varian.ccip.client.PatientClient4Feign;
import com.varian.ccip.client.PatientVO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CcipEncounterApplication.class})
public class EncounterPatientClientTest {

	@Autowired
	private PatientClient4Feign patientClient4Feign;
	
	@Test
	public void testFindByPatientSer() {
		PatientVO patientVO = patientClient4Feign.findByPatientSer(123l);
		System.out.println(patientVO);
	}

}
