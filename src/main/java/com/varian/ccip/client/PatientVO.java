package com.varian.ccip.client;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class PatientVO {
    private Integer id;

    private String vip;

    private String hisId;

    private String vId;

    private String pinyin;

    private String address;

    private String contactName;

    private String contactAddress;

    private String contactHomePhone;

    private String contactWorkPhone;

    private String contactMobilePhone;

    private String contactRelationship;

    private Date birthDate;

    private String homePhone;

    private String workPhone;

    private String mobilePhone;

    private String nationalId;

    private String chineseName;

    private String citizenship;

    private String englishName;

    private String ethnicGroup;

    private String radiationId;

    private String maritalStatus;

    private String patientStatus;

    private String patientHistory;

    private String createdUser;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdDate;

    private String lastUpdatedUser;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdatedDate;

    private Long patientSer;

    private String gender;

    private String id1;
    
    private String patientInfo;
}