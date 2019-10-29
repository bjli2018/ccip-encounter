package com.varian.ccip.model;

import java.util.Date;

import lombok.Data;

@Data
public class Encounter {
    private Integer id;

    private Integer age;

    private String urgent;

    private String primaryPhysicianId;

    private String primaryPhysicianGroupId;

    private String primaryPhysicianGroupName;

    private String physicianbId;

    private String physicianbName;

    private String physiciancId;

    private String physiciancName;

    private String createdUser;

    private Date createdDate;

    private Date lastUpdatedDate;

    private String lastUpdatedUser;

    private String physicistId;

    private String physicianPhone;

    private Long patientSer;

    private String encounterInfo;
}