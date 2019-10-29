package com.varian.ccip.model;

import java.util.Date;

import lombok.Data;

@Data
public class EncounterCarePathVO {
    private Integer id;

    private Integer encounterId;

    private Integer cpInstanceId;

    private String category;

    private String physicistId;

    private String crtUser;

    private Date crtTime;
}