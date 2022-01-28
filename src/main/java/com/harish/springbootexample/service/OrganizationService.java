package com.harish.springbootexample.service;

import com.harish.springbootexample.exception.InactiveOrganizationException;
import com.harish.springbootexample.exception.InvalidInputException;
import com.harish.springbootexample.exception.NotFoundException;
import com.harish.springbootexample.model.Organization;
import com.harish.springbootexample.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {

    @Autowired
    OrganizationRepository organizationRepository;

    public List<Organization> searchOrgnization(String name) {
        List<Organization> organizations = organizationRepository.findByFirstName(name);
        return  organizations;
    }

    public Organization getOrganization(Long id) {
        if (id == 0) {
            throw new InvalidInputException("Invalid");
        }

        Optional<Organization> organization = organizationRepository.findById(id);

        if(!organization.isPresent()) {
            throw new NotFoundException("Customer NOT Found");
        }

        if(organization.get().getId() == 5) {
            throw new InactiveOrganizationException("Inactive Organization");
        }

        return organization.get();
    }

    public void saveOrganization(Organization organization) {
        organizationRepository.save(organization);
    }
}
