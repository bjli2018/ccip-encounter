package com.varian.ccip.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.varian.ccip.dao.EncounterCarePathMapper;
import com.varian.ccip.dao.EncounterMapper;
import com.varian.ccip.model.Encounter;
import com.varian.ccip.model.EncounterCarePath;
import com.varian.ccip.model.EncounterVO;

@Service
public class EncounterService {
    @Autowired
    private EncounterMapper encounterMapper;
    @Autowired
    private EncounterCarePathMapper encounterCarePathMapper;
    
    public EncounterVO getEncounterById(Integer id) {
    	Encounter encounter = this.encounterMapper.selectByPrimaryKey(id);
    	EncounterVO encounterVO = new EncounterVO();
		BeanUtils.copyProperties(encounter, encounterVO);
		return encounterVO;  	
    }
    
    @Transactional
    public void insertEncounterAndEncounterCarePathList(Encounter encounter,List<EncounterCarePath> list) {
    	this.encounterMapper.insertSelective(encounter);
    	list.forEach(encounterCarePath->{
    		encounterCarePath.setEncounterId(encounter.getId());
    	});
    	int a = 10/0;
    	this.encounterCarePathMapper.insertBatch(list);
    }
}
