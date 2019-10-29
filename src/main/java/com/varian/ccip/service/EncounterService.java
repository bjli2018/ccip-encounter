package com.varian.ccip.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varian.ccip.dao.EncounterMapper;
import com.varian.ccip.model.Encounter;
import com.varian.ccip.model.EncounterVO;

@Service
public class EncounterService {
    @Autowired
    private EncounterMapper encounterMapper;
    
    public EncounterVO getEncounterById(Integer id) {
    	Encounter encounter = this.encounterMapper.selectByPrimaryKey(id);
    	EncounterVO encounterVO = new EncounterVO();
		BeanUtils.copyProperties(encounter, encounterVO);
		return encounterVO;  	
    }
}
