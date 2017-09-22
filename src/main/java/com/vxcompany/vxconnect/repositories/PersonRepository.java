package com.vxcompany.vxconnect.repositories;

import com.vxcompany.vxconnect.domain.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepository  extends PagingAndSortingRepository<Person, Long> {

    @Query("MATCH (p:Person) WHERE p.voornaam='David' RETURN p")
    Person findDavidShort();

    @Query("MATCH (p:Person) WHERE p.voornaam='Sander' RETURN p")
    Person findSanderShort();

    @Query ("MATCH (p:Person) RETURN p")
    Collection<Person> findAllPersons();

}
