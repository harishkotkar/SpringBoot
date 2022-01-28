package com.harish.springbootexample.repository;

import com.harish.springbootexample.model.Individual;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//https://spring.io/guides/gs/accessing-data-rest/

@RepositoryRestResource(collectionResourceRel = "individual", path = "individual")
public interface IndividualRestRepository extends PagingAndSortingRepository<Individual, Integer> {

    List<Individual> findByName(@Param("name") String name);
}
