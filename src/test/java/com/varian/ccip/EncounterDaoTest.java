package com.varian.ccip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.varian.ccip.dao.EncounterMapper;
import com.varian.ccip.model.Encounter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CcipEncounterApplication.class})
public class EncounterDaoTest {

	@Autowired
	private EncounterMapper encounterMapper;
	
	@Test
	public void testSelectByPrimaryKey() {
		Encounter encounter = this.encounterMapper.selectByPrimaryKey(1);
		System.out.println(encounter);
	}
	
	@Test
	public void testInsertSelective() {
		Encounter record = new Encounter(){{
			setAge(22);
		}};
		int result = this.encounterMapper.insertSelective(record);
		System.out.println(record);
		System.out.println("新增"+result+"条Encounter");
	}
}
