package com.varian.ccip.dao;

import com.varian.ccip.model.Encounter;

public interface EncounterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Encounter record);

    int insertSelective(Encounter record);

    Encounter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Encounter record);

    int updateByPrimaryKeyWithBLOBs(Encounter record);

    int updateByPrimaryKey(Encounter record);
}