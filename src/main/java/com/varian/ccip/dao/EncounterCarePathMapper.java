package com.varian.ccip.dao;

import java.util.List;

import com.varian.ccip.model.EncounterCarePath;

public interface EncounterCarePathMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EncounterCarePath record);

    int insertSelective(EncounterCarePath record);

    EncounterCarePath selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EncounterCarePath record);

    int updateByPrimaryKey(EncounterCarePath record);
    
    void insertBatch(List<EncounterCarePath> list);
}