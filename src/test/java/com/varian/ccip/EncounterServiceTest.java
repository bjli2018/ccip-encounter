package com.varian.ccip;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.varian.ccip.model.Encounter;
import com.varian.ccip.model.EncounterCarePath;
import com.varian.ccip.service.EncounterService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CcipEncounterApplication.class})
public class EncounterServiceTest {

	@Autowired
	private EncounterService encounterService;
	
	@Test
	public void testInsertEncounterAndEncounterCarePathList() {
		Encounter encounter = new Encounter(){{
			setAge(22);
		}};
		EncounterCarePath record = new EncounterCarePath() {{
			setEncounterId(1237);
			setCpInstanceId(591);
			setCategory("PRIMARY");
			setCrtUser("vms\\gengjianhao");
			setPhysicistId("1014");
		}};
		
		List<EncounterCarePath> list = new ArrayList<>();
		list.add(record);
		list.add(record);
		encounterService.insertEncounterAndEncounterCarePathList(encounter, list);
	}
}
