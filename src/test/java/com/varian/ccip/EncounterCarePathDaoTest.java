package com.varian.ccip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.varian.ccip.dao.EncounterCarePathMapper;
import com.varian.ccip.model.EncounterCarePath;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CcipEncounterApplication.class})
public class EncounterCarePathDaoTest {

	@Autowired
	private EncounterCarePathMapper encounterCarePathMapper;
	
	@Test
	public void testSelectByPrimaryKey() {
		EncounterCarePath encounterCarePath = this.encounterCarePathMapper.selectByPrimaryKey(1);
		System.out.println(encounterCarePath);
	}

	@Test
	public void testInsertSelective() {
		EncounterCarePath record = new EncounterCarePath();
		record.setEncounterId(1237);
		record.setCpInstanceId(591);
		record.setCategory("PRIMARY");
		record.setCrtUser("vms\\gengjianhao");
		record.setPhysicistId("1014");
		
		int result = this.encounterCarePathMapper.insertSelective(record);
		System.out.println("新增"+result+"条EncounterCarePath");
	}
}
