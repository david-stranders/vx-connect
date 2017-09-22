package com.vxcompany.vxconnect.domain;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Getter
@Setter
public class Person extends Node{

    private String voornaam;
    private String achternaam;
    private Integer leeftijd;
    private String email;
}
