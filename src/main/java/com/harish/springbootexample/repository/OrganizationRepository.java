package com.harish.springbootexample.repository;

import com.harish.springbootexample.model.Organization;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends CrudRepository<Organization, Long> {

    List<Organization> findByFirstName(String firstName);
    List<Organization> findByFirstNameAndLastName(String firstName,String lastName);

    Optional<Organization> findById(Long id);

}
