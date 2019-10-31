package com.varian.ccip;

import java.util.ArrayList;
import java.util.List;

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
		EncounterCarePath record = new EncounterCarePath() {{
			setEncounterId(1237);
			setCpInstanceId(591);
			setCategory("PRIMARY");
			setCrtUser("vms\\gengjianhao");
			setPhysicistId("1014");
		}};
		
		int result = this.encounterCarePathMapper.insertSelective(record);
		System.out.println("新增"+result+"条EncounterCarePath");
	}
	
	@Test
	public void testInsertBatch() {
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
		
		this.encounterCarePathMapper.insertBatch(list);
	}
}
