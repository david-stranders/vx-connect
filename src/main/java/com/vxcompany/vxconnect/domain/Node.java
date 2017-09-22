package com.vxcompany.vxconnect.domain;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Getter
@Setter
public class Node {

    @GraphId
    private Long id;
}
